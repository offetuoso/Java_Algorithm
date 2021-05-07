package ex.algorithm.implement;
import java.util.ArrayList;
import java.util.Scanner;

public class RoyalKnight{
	public static void main(String[] args) {
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String input_data = sc.nextLine();
		
		int row =  Integer.parseInt(input_data.substring(1,2));
		int column =  (int)input_data.substring(0,1).charAt(0) - (int) 'a' + 1;
		
		ArrayList steps = new ArrayList<ArrayList<Integer[]>>();
		
		steps.add(new Integer[]{-2,-1});
		steps.add(new Integer[]{-2,+1});
		steps.add(new Integer[]{-1,+2});
		steps.add(new Integer[]{+1,+2});
		steps.add(new Integer[]{+2,+1});
		steps.add(new Integer[]{+2,-1});
		steps.add(new Integer[]{+1,-2});
		steps.add(new Integer[]{-1,-2});
		
		for (Object obj : steps) {
			Integer[] step = (Integer[])obj;
			int next_row = row + step[0];
			int next_column = column + step[1];
			
			if((1 <= next_row && next_row <= 8) && (1 <= next_column && next_column <= 8)) {
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}