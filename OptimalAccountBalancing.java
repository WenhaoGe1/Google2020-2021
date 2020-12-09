import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OptimalAccountBalancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		findBalance(new int[][] {{1,2,2}, {2,4,5}, {1,4,1}});
//		findBalance(new int[][] {{0,1,10}, {1,0,1}, {1,2,5}, {2,0,5}});
		findBalance(new int[][] {{0,1,2},{1,2,1},{1,3,1}});
//		findBalance(new int[][] {{0,1,5},{2,3,1},{2,0,1},{4,0,2}});
	}
	private static int findBalance(int[][] transactions) {
		Map<Integer, Integer> balance = new HashMap<>();

		for (int[] t: transactions) {
			balance.put(t[0], balance.getOrDefault(t[0], 0) + t[2]);
			balance.put(t[1], balance.getOrDefault(t[1], 0) - t[2]);
		}
		System.out.println(balance);
		
		
		return 0;
	}
	
}
