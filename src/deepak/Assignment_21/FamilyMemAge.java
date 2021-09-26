/*Assignment 21 [Find the difference between oldest and youngest family member.] DATE 08/22
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

package deepak.Assignment_21;

public class FamilyMemAge {

	int getAgeDifference(int[] arr) {
		int maxAge = arr[0];
		int minAge = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxAge < arr[i]) {
				maxAge = arr[i];
			}
			if (minAge > arr[i]) {
				minAge = arr[i];
			}
		}
		return maxAge - minAge;
	}

	public static void main(String[] args) {
		FamilyMemAge obj = new FamilyMemAge();
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		System.out.print("Difference between oldest and youngest family member is: ");
		System.out.println(obj.getAgeDifference(age));
	}

}
