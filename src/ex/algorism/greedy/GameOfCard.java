package ex.algorism.greedy;
import java.util.Arrays;
import java.util.Scanner;

public class GameOfCard {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		String n = sc.nextLine();
		String m = null;

		
		String arr[] =  n.split(" ");
		
		int maximum = 0;
		for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
			m = sc.nextLine();
			String row[] = m.split(" ");
			
			//int[] nums = Arrays.asList(row).stream().mapToInt(Integer::parseInt).toArray();
			int[] nums = new int[row.length];
	        for(int j=0; j<row.length; j++) {
	            nums[j] = Integer.parseInt(row[j]);
	        }
			
			
			
			Arrays.sort(nums);
			
			if(maximum < nums[0]) {
				maximum = nums[0];
			}
			
		}
		
		System.out.println(maximum);
		
	}
}
