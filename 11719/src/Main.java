import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		
		for(i = 0; i<100; i++){
			str[i] = sc.nextLine();
			System.out.println(str[i]);
			
			if(sc.hasNextLine() == false)
				break;
		}
		sc.close();
	}
}
