package poojaJoshi;

public class Assignment_14_1 {

	void max(int[] number) {
		int maxNo = 0;
		int cnt = 0;
		for (int index = 0; index < number.length; index++) {
			if (number[index] >= maxNo) {
				maxNo = number[index];
				cnt++;
			}

		}
		System.out.println("total count of array = " + cnt);
		System.out.println(maxNo);

	}

	public static void main(String[] args) {
		Assignment_14_1 assignment_14_1 = new Assignment_14_1();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		assignment_14_1.max(input);
	}

}
