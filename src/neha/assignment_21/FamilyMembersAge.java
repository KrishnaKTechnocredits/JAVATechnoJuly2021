package neha.assignment_21;
/*Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/
public class FamilyMembersAge {
	int diffOldestYoungestMembersAge(int[] ageArr) {
		int minAge = ageArr[0];
		int maxAge = ageArr[0];
		for (int index = 1; index < ageArr.length; index++) {
			if (ageArr[index] > maxAge)
				maxAge = ageArr[index];
			else if (ageArr[index] < minAge)
				minAge = ageArr[index];
		}
		return maxAge - minAge;
	}

	public static void main(String[] args) {
		FamilyMembersAge familyMembersAge = new FamilyMembersAge();
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		System.out.println("Difference between oldest and youngest members of the family is: "
				+ familyMembersAge.diffOldestYoungestMembersAge(age));

	}
}
