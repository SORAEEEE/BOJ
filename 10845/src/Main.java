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
				// ���� ��쿡�� -1 ���
				System.out.println(queue[front]);

				if (queue[front] == -1) {
				} else {
					queue[front] = -1;
					front++;
				}
			} else if (temp.equals("size")) {
				// ����ִ� ������ ����
				if (back == 0)
					System.out.println("0");
				else
					System.out.println(back - front);
			} else if (temp.equals("empty")) {
				// ť�� ��������� 1, �ƴϸ� 0
				if (back == 0 || back <= front)
					System.out.println("1");
				else
					System.out.println("0");
			} else if (temp.equals("front")) {
				// ���� �� ���, ������ -1
				System.out.println(queue[front]);
			} else if (temp.equals("back")) {
				// ���� �� ���, ������ -1
				if (back == 0)
					System.out.println("-1");
				else
					System.out.println(queue[back - 1]);
			}
		}

		sc.close();
	}
}