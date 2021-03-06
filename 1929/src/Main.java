import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		for (; M <= N; M++) {
			if (isPrime(M))
				System.out.println(M);
		}

		sc.close();
	}

	public static boolean isPrime(int a) {
		if (a < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
}
