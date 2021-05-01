package ex.algorism.greedy;
import java.util.Scanner;

public class MakeOne {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while (true) {
			int target = (n/k)*k;
			result += n-target;
			n = target;
			
			if(n < k) {
				break;
			}
			
			n = n / k;
			result++;
			
		}
		result += (n-1);
		System.out.println(result);
	}
}
