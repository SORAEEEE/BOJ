import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			isVPS(sc.next());
		}

		sc.close();
	}

	static void isVPS(String str) {
		boolean[] stack = new boolean[50];
		Arrays.fill(stack, false); //�ʱ�ȭ
		int idx = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack[idx] = true;
				idx++;
			}
			else if (str.charAt(i) == ')'){
				if(idx==0){
					System.out.println("NO");
					return;
				}
				idx--;
				stack[idx] = false;
			}
		}
		
		if(idx == 0) System.out.println("YES");
		else System.out.println("NO");
	}
}
