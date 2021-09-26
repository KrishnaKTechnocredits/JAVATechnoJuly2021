/*Find the age difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/
package shraddha.ArrayExamples;

public class DifferenceInAge {
	int oldestMember;
	int youngestMember;

	public static void main(String[] args) {
		int[] ageArray = { 10, 34, 38, 68, 72, 95, 4 };
		DifferenceInAge ageObject = new DifferenceInAge();
		ageObject.getOldestFamilyMember(ageArray);
		ageObject.getYoungestFamilyMember(ageArray);
		System.out.println("Age difference between oldest and youngest family member is :- "
				+ (ageObject.oldestMember - ageObject.youngestMember) + " years");
	}

	// method to get oldest member of the family
	int getOldestFamilyMember(int[] arrayInput) {
		oldestMember = arrayInput[0];
		for (int index = 0; index < arrayInput.length; index++) {
			if (oldestMember < arrayInput[index])
				oldestMember = arrayInput[index];
		}
		System.out.println("Oldest member of the family is " + oldestMember + " years old");
		return oldestMember;
	}

	// method to get youngest member of the family
	int getYoungestFamilyMember(int[] arrayInput) {
		youngestMember = arrayInput[0];
		for (int index = 0; index < arrayInput.length; index++) {
			if (youngestMember > arrayInput[index])
				youngestMember = arrayInput[index];
		}
		System.out.println("Youngest member of the family is " + youngestMember + " years old");
		return youngestMember;
	}
}
