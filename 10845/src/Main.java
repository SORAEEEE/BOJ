import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] queue = new int[10000];
		Arrays.fill(queue, -1);
		int back = 0;
		int front = 0;
		String temp;
		for (int i = 0; i < N; i++) {
			temp = sc.next();

			if (temp.equals("push")) {
				queue[back] = sc.nextInt();
				back++;
			} else if (temp.equals("pop")) {
				// 없을 경우에는 -1 출력
				System.out.println(queue[front]);

				if (queue[front] == -1) { 
				} else {
					queue[front] = -1;
					front++;
				}
			} else if (temp.equals("size")) {
				// 들어있는 정수의 개수
				if (back == 0)
					System.out.println("0");
				else
					System.out.println(back - front);
			} else if (temp.equals("empty")) {
				// 큐가 비어있으면 1, 아니면 0
				if (back == 0 || back <= front)
					System.out.println("1");
				else
					System.out.println("0");
			} else if (temp.equals("front")) {
				// 가장 앞 출력, 없으면 -1
				System.out.println(queue[front]);
			} else if (temp.equals("back")) {
				// 가장 뒤 출력, 없으면 -1
				if (back == 0)
					System.out.println("-1");
				else
					System.out.println(queue[back - 1]);
			}
		}

		sc.close();
	}
}
