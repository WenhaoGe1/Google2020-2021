
public class MaximumTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		giveMeMaxTime("23:5?");// 23:59
//	    giveMeMaxTime("2?:22");// 23:22
//	    giveMeMaxTime("0?:??");// 09:59
//	    giveMeMaxTime("1?:??");// 19:59
//	    giveMeMaxTime("?4:??");// 14:59
//	    giveMeMaxTime("?3:??");// 23:59
//	    giveMeMaxTime("??:??");// 23:59
//	    giveMeMaxTime("?4:5?"); //14:59
//	    giveMeMaxTime("?4:??"); //14:59
//	    giveMeMaxTime("?3:??"); //23:59
	    giveMeMaxTime("23:5?"); //23:59
	    giveMeMaxTime("2?:22"); //23:22
	    giveMeMaxTime("0?:??"); //09:59
	    giveMeMaxTime("1?:??"); //19:59
	    giveMeMaxTime("?4:0?"); //14:09
	    giveMeMaxTime("?9:4?"); //19:49
	}
	private static String giveMeMaxTime(String time) {
		StringBuilder res = new StringBuilder();
		if (time.charAt(0) == '?') {
			if (time.charAt(1) == '?' || time.charAt(1) == '3') {
				res.append('2');
			} else {
				res.append('1');
			}
		} else {
			res.append(time.charAt(0));
		}
		
		if (time.charAt(1) == '?') {
			if (time.charAt(0) == '?' || time.charAt(0) == '2') {
				res.append('3');
			} else {
				res.append('9');
			}
		} else {
			res.append(time.charAt(1));
		}
		res.append(':');
		
		if (time.charAt(3) == '?') {
			res.append('5');
		} else {
			res.append(time.charAt(3));
		}
		
		if (time.charAt(4) == '?') {
			res.append('9');
		} else {
			res.append(time.charAt(4));
		}
		System.out.println(res.toString());
		return res.toString();
	}
}
