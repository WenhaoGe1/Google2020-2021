import java.util.Arrays;

public class MinNumberOfChairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meetingRoomII(new int[] {1, 2, 6, 5, 3}, new int[] {5, 5, 7, 6, 8});
	}
	private static int meetingRoomII(int[] s, int[] e) {
		int gloMax = 0;
		int curMax = 0;
		Arrays.sort(s);
		Arrays.sort(e);
		int start = 0;
		int end = 0;
		
		while (start < s.length) {
			if (s[start] < e[end]) {
				curMax++;
				start++;
			} else if (s[start] >= e[end]) {
				gloMax = Math.max(gloMax, curMax);
				curMax--;
				end++;
			}
		}
		System.out.print(gloMax);
		return gloMax;
	}
}
