import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int caseNum = sc.nextInt();
		int M, N, x, y;
		int max;
		int k;

		for (int i = 0; i < caseNum; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();

			//if(y == N) y = 0;
			max = M * N;
			
			for (k = x; k <= max; k += M) {
				//System.out.println(k + " " + N + " " + k%N);
				if ((k-1) % N == (y-1))
					break;
			}

			if (k > max)
				System.out.println("-1");
			else
				System.out.println(k);
		}

		sc.close();
	}
}
