package varun_array_assignment;

public class MaxAndMinAgeInOneMethod {
	int maxAge = 0;
	int minAge = 0;

	int differenceBetwnoldestandYoungestFamilyMemberAge(int[] arr) {
		minAge = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxAge) {
				maxAge = arr[index];
			}
			if(arr[index] < minAge) {
				minAge = arr[index];
			}
		}
		return maxAge-minAge;
	}
	void display(int [] age) {
		System.out.println("Difference between age of Oldest and youngest family member is " +differenceBetwnoldestandYoungestFamilyMemberAge(age));
		
	}

	public static void main(String[] args) {
		MaxAndMinAgeInOneMethod assignment_21_1 = new MaxAndMinAgeInOneMethod();
		int[] age = {10,34,38,68,72,95,6};
		assignment_21_1.display(age);
		
	}
}
