package ex.algorithm.greedy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LawofLargeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int n = Integer.parseInt(str1.split(" ")[0]);
		int m = Integer.parseInt(str1.split(" ")[1]);
		int k = Integer.parseInt(str1.split(" ")[2]);
		String list[] = str2.split(" ");
		Arrays.sort(list);
		
		int first = Integer.parseInt(list[n-1]);
		int second = Integer.parseInt(list[n-2]);
		
		//System.out.println("n"+n);
		//System.out.println("m"+m);
		//System.out.println("k"+k);
		//System.out.println("first"+first);
		//System.out.println("second"+second);
		
		//5 5 4 5 5 4 5
		
		int count = (m/(k+1))*k;
		count += m%(k+1);
		int count2 = m-count; 
		
		//System.out.println(count);
		
		result = (count*first) + (count2*second);
				
		
		
		
		
		
		
				
		System.out.println(result);
	}
}
