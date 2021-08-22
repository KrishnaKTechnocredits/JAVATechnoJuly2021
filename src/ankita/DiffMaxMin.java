package ankita;

public class DiffMaxMin {
	int getMaxMindiff(int[] num) {
		int min = num[0];
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min)
				min = num[index];
			if (num[index] > max)
				max = num[index];
		}
		return max - min;
	}

	public static void main(String[] args) {
		int[] number = { 1, 11, 44, 23, 55, 99, 23 };
		DiffMaxMin diffmaxmin = new DiffMaxMin();
		System.out.println("difference between Max & Min is "+diffmaxmin.getMaxMindiff(number));
	}
}
