package ex.algorithm.greedy;

public class ReverseCharge {
	
	public static void main(String[] args) {
		
		int n = 1260;
		int[] coins = {500,100,50,10};
		int count = 0;
		
		for (int coin : coins) {
			count += n/coin;
			n %= coin;
		}
		
		System.out.println(count);
	}
}
