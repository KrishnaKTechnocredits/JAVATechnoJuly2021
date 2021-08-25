package mratunjay.Assignment_21;

public class Assignment_21 {

	int[] age = { 10, 34, 38, 68, 72, 95, 6 };
	int index = 0;

	int[] SortArrayInDecendingOrder(int[] age) {
		int temp;
		for (index = 0; index < age.length; index++) {

			for (int j = index + 1; j < age.length; j++) {

				if (age[index] < age[j]) {

					temp = age[index];
					age[index] = age[j];
					age[j] = temp;
				}
			}
			System.out.println(age[index]);

		}
		return age;
	}

	void getDifferenceOfMinimumAndMaximumNumber(int[] age) {
		int max = 0;
		int min = 0;
		int diff = 0;

		for (index = 0; index < age.length; index++) {
			if (index == 0) {
				max = age[index];
			} else if (index == age.length - 1) {
				min = age[index];
			}
			diff = max - min;
		}
		System.out.println("max value: " + max + " minimum value: " + min + " difference of value: " + diff);
	}

	public static void main(String[] args) {

		Assignment_21 A_21 = new Assignment_21();
		A_21.SortArrayInDecendingOrder(A_21.age);
		A_21.getDifferenceOfMinimumAndMaximumNumber(A_21.age);

	}

}
