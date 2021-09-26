package sourabh;

public class Assignment_21 {     //Difference Between Older And Youngest

	int getDifferenceBetweenOldYoungFamilyMember(int[] input) {
		int oldest = input[0];
		int youngest = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > oldest) {
				oldest = input[index];
			} else if (input[index] < youngest) {
				youngest = input[index];
			}
		}
		return oldest - youngest;
	}

	public static void main(String[] args) {
		Assignment_21 assignment21 = new Assignment_21();
		int[] age = { 15, 24, 39, 65, 77, 93, 6 };
		System.out.println("The difference between oldest and youngest family member is: "
				+ assignment21.getDifferenceBetweenOldYoungFamilyMember(age));
	}
}
