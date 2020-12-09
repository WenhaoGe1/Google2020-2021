import java.util.HashMap;
import java.util.Map;

public class TImeToTypeAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleRowKeyboard("abcdefghijklmnopqrstuvwxy", "cba");
	}
	private static int singleRowKeyboard(String keyboard, String text) {
		if (text == null || text.length() == 0) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < keyboard.length(); i++) {
			map.put(keyboard.charAt(i), i);
		}
		
		int res = map.get(text.charAt(0)) - 0;
		for (int i = 1; i < text.length(); i++) {
			res += Math.abs(map.get(text.charAt(i)) - map.get(text.charAt(i - 1)));	
		}
		System.out.print(res);
		return res;
	}
}
