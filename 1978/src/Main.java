import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int primeNum = 0;

		for (int i = 0; i < num; i++) {
			if (isPrime(sc.nextInt()) == true)
				primeNum++;
		}

		System.out.println(primeNum);

		sc.close();
	}

	static boolean isPrime(int a) {
		if (a < 2)
			return false;

		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
}
