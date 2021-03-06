import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] stack = new int[10000];
		int idx = 0;
		String temp;
		
		for(int i = 0; i<N; i++){
			temp = sc.next();
			if(temp.equals("push")){
				stack[idx] = sc.nextInt();
				idx++;
			}
			else if(temp.equals("pop")){
				if(idx==0) System.out.println("-1");
				else{
					idx--;
					System.out.println(stack[idx]);
				}
			}
			else if(temp.equals("size")){
				System.out.println(idx);
			}
			else if(temp.equals("empty")){
				if(idx==0) System.out.println("1");
				else System.out.println("0");
			}
			else if(temp.equals("top")){
				if(idx==0) System.out.println("-1");
				else{
					idx--;
					System.out.println(stack[idx]);
					idx++;
				}
			}
		}
		
		sc.close();
	}
}
