
public class WateringFlowers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {2, 4, 5, 1, 2}, 5, 7);
	}
	private static int solution(int[] plants, int capacity1, int capacity2) {
		int res = 2;
		
		int one = 0;
		int two = 0;
		
		int left = 0;
		int right = plants.length - 1;
		int mid = left + (right - left) / 2;
		
		while (left < right) {
			capacity1 -= plants[left++];
			capacity2 -= plants[right--];
			if (left < mid - 1 && one < plants[left + 1]) {
				res++;
				one = capacity1;
			}
			if (left > mid + 1 && two < plants[right - 1]) {		
				res++;
				two = capacity2;
			}
			
		}
		
		if (left == right && capacity1 + capacity2 < plants[mid]) {
			res++;
		}
		System.out.print(res);
		return res;
	}
	

}
