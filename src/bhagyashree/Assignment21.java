/*
 * Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};

 */
package bhagyashree;

public class Assignment21 {

	int getDifferenceOfOldestAndYougest(int[] age) {
		int oldest = age[0];
		int youngest = age[0];
		for (int index = 0; index < age.length; index++) {
			if (age[index] > oldest)
				oldest = age[index];
			else if (age[index] < youngest)
				youngest = age[index];
		}
		return oldest - youngest;
	}

	public static void main(String[] args) {
		int[] input = { 10, 34, 38, 68, 72, 95, 6 };
		Assignment21 ass21 = new Assignment21();
		System.out.println("Difference between oldest and youngest family member is: "
				+ ass21.getDifferenceOfOldestAndYougest(input));
	}

}
