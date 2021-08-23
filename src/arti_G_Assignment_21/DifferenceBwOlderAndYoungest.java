package arti_G_Assignment_21;

/*Assignment - 21 : 22nd Aug'2021

Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/
public class DifferenceBwOlderAndYoungest {

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
		DifferenceBwOlderAndYoungest differenceBwOlderAndYoungest = new DifferenceBwOlderAndYoungest();
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		System.out.println("The difference between oldest and youngest family member is: "
				+ differenceBwOlderAndYoungest.getDifferenceBetweenOldYoungFamilyMember(age));
	}
}
