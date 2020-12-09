
public class LargestSubarrayLengthK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSubarray(new int[]{1,4,3,2,5}, 4);
	}
	private static int[] findSubarray(int[] array, int k) {
		int[] res = new int[k];
		if (array.length < k) {
			return null;
		}
		if (array.length == k) {
			return array;
		}
		int i = 0;
		int j = i + 1;
		int resIndex = array[i] > array[j] ? i : j;
		while (i + k < array.length && j + k < array.length) {
			resIndex = compareInt(i, j, array, k);
			i++;
			j++;
		}
		for (int m = 0; m < k; m++) {
			res[m] = array[resIndex++];
		}
		for (int integer : res) {
			System.out.println(integer);
		}
		return res;
	}
	private static int compareInt(int i, int j, int[] array, int k) {
		int first = i;
		int second = j;

		int count = 0;
		while (count < k && i < array.length && j < array.length) {
			if (array[i] > array[j]) {
				return first;
			} else if (array[i] == array[j]) {
				i++;
				j++;
			} else {
				return second;
			}
		}
		return -1;
	}

}
