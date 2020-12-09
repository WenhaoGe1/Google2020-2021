import java.util.*;

public class filledArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filledArray(5, new int[] {0 ,3});
	}
	private static String filledArray(int N, int[] A) {
		if (N == 0 || A == null || A.length == 0) {
			return new String("");
		}
		Set<Integer> set = new HashSet<>();
		for (int i : A) {
			set.add(i);
		}
 		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			if (set.contains(i)) {
				sb.append('+');
			} else {
				sb.append('-');
			}
		}
		System.out.println(sb);
		return sb.toString();
		
	}

}
