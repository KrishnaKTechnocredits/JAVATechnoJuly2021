package poojaJoshi;

public class Assignment_13_2 {
	int cnt;

	void positiveNumberCount(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Assignment_13_2 assignment13_2 = new Assignment_13_2();
		int[] input = { 0, -0, -44, 0, 0, 55, 0, 0, 0, -99, 10, 0, -22 };
		assignment13_2.positiveNumberCount(input);

	}
}