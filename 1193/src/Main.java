import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int i = 1; // ��
		int num; // ��°
		X--;

		while (X / sum(i) != 0) {
			i++;
		}
		num = X - sum(i - 1);

		if (i % 2 == 1) {
			System.out.println((i - num) + "/" + (num + 1));
		} else
			System.out.println((num + 1) + "/" + (i - num));

		
		sc.close();
	}

	static int sum(int i) {
		return i * (i + 1) / 2;
	}
}