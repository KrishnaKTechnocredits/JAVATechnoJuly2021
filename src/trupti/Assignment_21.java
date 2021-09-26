package trupti;

public class Assignment_21 {

	int getDiffOfAge(int[] input) {
		int diffAge = 0;
		int youngest = 0;
		int oldest = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0 && input[index] < 10) {
				youngest = input[index];
			} else if (input[index] > 90 && input[index] < 100) {
				oldest = input[index];
			}
			diffAge=oldest-youngest;
		}
		return diffAge;
	}

	public static void main(String[] args) {
		Assignment_21 assignment_21 = new Assignment_21();
		int[] age = {10, 34, 38, 68, 72, 95, 6};
		System.out.println("Age difference: " + assignment_21.getDiffOfAge(age));
	}
}
