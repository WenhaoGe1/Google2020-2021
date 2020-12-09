import java.util.ArrayList;
import java.util.List;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareString("abcd aabc bd", "aaa aa");
	}
	private static int[] compareString(String A, String B) {
		String[] one = findString(A);
		String[] two = findString(B);
		
		int[] res = new int[two.length];
		for (int i = 0; i < two.length; i++) {
			int occu2 = findOccu(two[i]);
			int count = 0;
			
			for (int j = 0; j < one.length; j++) {
				int occu1 = findOccu(one[j]);
				if (occu1 < occu2) {
					count++;
				}
			}
			res[i] = count;
		}
		for (int i : res) {
			System.out.println(i);
		}
		return res;
	}
	private static String[] findString(String s) {
		String[] array = s.split("\\s+");
		return array;

	}
	private static int findOccu(String s) {
		char minLetter = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp < minLetter) {
				minLetter = temp;
				count = 1;
			} else if (temp == minLetter) {
				count++;
			}
		}
		return count;
	}
}
