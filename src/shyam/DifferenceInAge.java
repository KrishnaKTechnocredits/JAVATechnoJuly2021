/*Find the age difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/

package shyam;

public class DifferenceInAge {
	int oldestMember;
	int youngestMember;
	
	public static void main(String[] args) {
		
		int[] ageArray = {10,34,38,68,72,95,6};
		
		DifferenceInAge ageObject = new DifferenceInAge();
		
		ageObject.getOldestFamilyMember(ageArray);
		ageObject.getYoungestFamilyMember(ageArray);
		
		System.out.println("Age difference between oldest and youngest family member is : "
				+ (ageObject.oldestMember - ageObject.youngestMember) );
	}

	
	int getOldestFamilyMember(int[] arrayInput) {
		oldestMember = arrayInput[0];
		for (int index = 0; index < arrayInput.length; index++) {
			if (oldestMember < arrayInput[index])
				oldestMember = arrayInput[index];
		}
		
		System.out.println("Oldest member of the family in years is " + oldestMember);
		
		return oldestMember;
	}

	
	int getYoungestFamilyMember(int[] arrayInput) {
		youngestMember = arrayInput[0];
		for (int index = 0; index < arrayInput.length; index++) {
			if (youngestMember > arrayInput[index])
				youngestMember = arrayInput[index];
		}
		
		System.out.println("Youngest member of the family in years is " + youngestMember);
		
		return youngestMember;
	}
}
