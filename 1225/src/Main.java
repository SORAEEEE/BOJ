import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger num1 = BigInteger.valueOf(0);
		BigInteger num2 = BigInteger.valueOf(0);
		
		for(int i = 0; i<str1.length(); i++){
			num1 = num1.add(BigInteger.valueOf(str1.charAt(i)-48));
		}
				
		for(int j =0; j<str2.length(); j++){
			num2 = num2.add(BigInteger.valueOf(str2.charAt(j)-48));
		}
		
		sum = num1.multiply(num2);
		System.out.println(sum);
		
		sc.close();
	}
}
