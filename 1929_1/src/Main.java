import java.util.Scanner;

public class Main {
	static final int MAX = 1000001;
	public static void main(String[] args){
		boolean arr[] = new boolean[MAX];
		arr[0] = true; arr[1] = true;		
		
		for(int i = 2; i<MAX; i++){
			if(arr[i])
				continue;
			for(int j = 2*i; j<MAX; j+=i){
				arr[j] = true; 
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i = M; i<=N; i++){
			if(arr[i] == false)
				System.out.println(i);
		}
		
				
		sc.close();
	}
}
