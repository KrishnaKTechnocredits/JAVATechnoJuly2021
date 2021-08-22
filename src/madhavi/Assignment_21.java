package madhavi;

public class Assignment_21 {
	int getOldMember(int[] input) {
		int maxAge = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > maxAge) {
				maxAge = input[i];
			}
		}
		return maxAge;
	}

	int getYoungMember(int[] input) {
		int minAge = 0;
		for (int i = 0; i < input.length; i++) {
			if (input.length - 1 > minAge) {
				minAge = input.length - 1;
			}
		}
		return minAge;
	}

	public static void main(String[] args) {
		Assignment_21 assignment_21 = new Assignment_21();

		System.out.println("Print difference between oldest and youngest family member: ");
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		// System.out.println(assignment_21.getOldMember(age));
		// System.out.println(assignment_21.getYoungMember(age));
		System.out.println(assignment_21.getOldMember(age) - assignment_21.getYoungMember(age));

	}

}
