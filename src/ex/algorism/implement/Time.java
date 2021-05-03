package ex.algorism.implement;
import java.util.Scanner;

public class Time{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int hour = 0;
		int minute = 0;
		int second = 0;
		int count = 0;

		while (true) {
			
			if((""+hour+minute+second).contains("3")) {
				count++;
			}
			
			second++;
			
			if(second == 60){
				minute ++;
				second = 0;
			}
			if(minute == 60){
				hour ++;
				minute = 0;
			}
			if(hour == n+1){
				break;
			}
		}
		System.out.println(count);
	}
}