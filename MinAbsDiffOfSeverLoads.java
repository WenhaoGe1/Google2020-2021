
public class MinAbsDiffOfSeverLoads {
	static int gloMin;
	static int total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minAbsDiff(new int[] {1,2,3,4,5});
	}
	private static int minAbsDiff(int[] array) {
		gloMin = Integer.MAX_VALUE;
		total = 0;
		for (int i : array) {
			total += i;
		}
		dfs(array, 0, 0);
		System.out.print(gloMin);
		return gloMin;
	}
	private static void dfs(int[] array, int index, int curSum) {
		if (index == array.length) {
			gloMin = Math.min(gloMin, Math.abs((total - curSum) - curSum));
			return;
		}
		dfs(array, index + 1, curSum + array[index]);
		dfs(array, index + 1, curSum);
	}

}
