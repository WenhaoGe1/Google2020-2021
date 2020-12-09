
public class MostBookedHotelRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findRoom(new String[] {"+5A", "+3E", "-1A", "+4F", "+5A", "-3E", "+3E"});
	}
	private static void findRoom(String[] rooms) {
		int[] hotel = new int[260];
		String res = new String();
		int gloMax = 0;
		
		for (String r : rooms) {
			if (r.charAt(0) == '+') {
				int temp = (r.charAt(1) - '0') * 10 + (r.charAt(2) - 'A');
				hotel[temp - 1]++;
				if (hotel[temp - 1] == gloMax) {					
					if (r.compareTo(res) < 0) {
						res = r;
					}
					gloMax = hotel[temp - 1];
				} else if (hotel[temp - 1] > gloMax) {
					gloMax = hotel[temp - 1];
					res = r;
				}
			}
		}
		
		System.out.print(res);
//		return res.substring(1);
	}
}
