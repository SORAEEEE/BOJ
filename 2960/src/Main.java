import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		boolean arr[] = new boolean[N + 1];
		int count = 0;

		for (int i = 2; i <= N; i++) {
			if (arr[i])
				continue;
			for (int j = i; j <= N; j += i) {
				if (arr[j])
					continue;

				arr[j] = true;
				count++;
				if (count == K) {
					System.out.println(j);
					return;
				}
			}
		}

	}
}
