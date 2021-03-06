import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String>[] strArrList;
	static ArrayList<String> output;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String temp;

		strArrList = (ArrayList<String>[]) new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			strArrList[i] = new ArrayList<String>();
		}

		for (int i = 1; i <= N; i++) {
			temp = sc.next();
			for (int j = 0; j < temp.length(); j++) {
				strArrList[i].add(temp.substring(j, j + 1));
			}
		}

		// test();
		pattern();
		sc.close();
	}

	public static void test() {
		for (int j = 0; j < output.size(); j++) {
			System.out.print(output.get(j));
		}
		System.out.println();
	}

	public static void pattern() {
		output = new ArrayList<String>();
		String temp;
		
		for(int i = 0; i<strArrList[1].size();i++){
			temp = strArrList[1].get(i);
			output.add(temp);
			//test();
			
			for (int idx = 2; idx <= N; idx++) {
				if (!temp.equals(strArrList[idx].get(i))) {
					output.remove(i);
					output.add("?");
					break;
				}
			}
		}
		
		test();
	}

}
