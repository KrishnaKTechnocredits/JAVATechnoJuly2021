package poojaJoshi;

public class Assignment_13_1 {

	int cnt;

	void positiveNumberCount(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] >= 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	public static void main(String[] args) {
		Assignment_13_1 assignment13_1 = new Assignment_13_1();
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		assignment13_1.positiveNumberCount(input);

	}
}
