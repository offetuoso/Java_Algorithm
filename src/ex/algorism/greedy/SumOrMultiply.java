package ex.algorism.greedy;
import java.util.Scanner;

public class SumOrMultiply {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		long result = str.charAt(0) - '0';
		for(int i=1; i < str.length();i++) {
			int num = str.charAt(i) - '0';
			if (num <= 1 ||result <= 1) {
				result += num;
			}else {
				result *= num;
			}
		}
		
		System.out.println(result);
	}
}
