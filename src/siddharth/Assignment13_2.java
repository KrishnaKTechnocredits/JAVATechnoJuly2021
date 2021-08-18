package siddharth;

public class Assignment13_2 {
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
		Assignment13_2 assignment13 = new Assignment13_2();
		int[] input = { 1, -11, -44, 23, 0, 55, 0, 0, 0, -99, -23, 0, -22 };
		assignment13.positiveNumberCount(input);

	}
}
