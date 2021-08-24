package shweta_Dharmadhikari.array_examples;

public class DifferenceBetweenOldestAndYoungestMember {
	int[] age = { 10, 34, 38, 68, 72, 95, 6 };
	int index = 0;
	int maxAge = age[index];
	int minAge = age[index];

	int printDifferenceBetweenOldestAndYoungestMember() {
		for (; index < age.length; index++) {
			if (age[index] > maxAge) {
				maxAge = age[index];
			} else if (age[index] < minAge) {
				minAge = age[index];
			}
		}
		return maxAge - minAge;
	}

	public static void main(String[] args) {
		DifferenceBetweenOldestAndYoungestMember differenceBetweenOldestAndYoungestMember = new DifferenceBetweenOldestAndYoungestMember();
		System.out.println("Difference between oldest and youngest family member is: "
				+ differenceBetweenOldestAndYoungestMember.printDifferenceBetweenOldestAndYoungestMember());
	}

}
