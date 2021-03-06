import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		String str = sc.next();
		int ascii;
		int max = 0, maxIdx = 0, maxCount = 0;

		for (int i = 0; i < str.length(); i++) {
			ascii = (int) str.charAt(i);
			if (ascii > 95)
				arr[ascii - 97]++;
			else
				arr[ascii - 65]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max)
				maxCount++;
		}

		if (maxCount > 1)
			System.out.println("?");
		else
			System.out.println((char) (maxIdx + 65));

		sc.close();
	}
}
