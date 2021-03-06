import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0, size;
		int testnum = sc.nextInt();
		int[] arr;

		while (i < testnum) {
			double sum = 0.0;
			size = sc.nextInt();
			arr = new int[size];

			for (int j = 0; j < size; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			System.out.format("%.3f%%%n", findRate(arr, (sum / size)));
			i++;
		}

		sc.close();
	}

	public static double findRate(int[] arr, double mean) {
		double num = 0.0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mean)
				num++;
		}

		return num / arr.length * 100;
	}
}
