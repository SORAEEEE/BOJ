import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int arrSize = sc.nextInt();
		double M = 0.0, sum = 0.0;
		double mean;

		arr = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (M < arr[i])
				M = arr[i];
		}

		mean = sum / arrSize;
		sc.close();
		
		System.out.format("%.2f%n", mean / M * 100);
	}
}
