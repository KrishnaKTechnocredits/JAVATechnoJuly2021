package suruchi.Assignment21;

import java.util.Scanner;

public class Program1 {

	int getYoungestFamilyMemberAge(int[] arr) {
		int minAge = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minAge)
				minAge = arr[index];
		}
		return minAge;
	}

	int getOldestFamilyMemberAge(int[] arr) {
		int maxAge = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxAge)
				maxAge = arr[index];
		}
		return maxAge;
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of family members: ");
		int agesOfFamilyMembers = scanner.nextInt();

		int[] age = new int[agesOfFamilyMembers];

		System.out.println("Enter the ages of all family members: ");
		for (int index = 0; index < age.length; index++)
			age[index] = scanner.nextInt();

		System.out.println();
		int ageDifference = program1.getOldestFamilyMemberAge(age) - program1.getYoungestFamilyMemberAge(age);

		System.out.println("Age difference between oldest and youngest family member is: " + Math.abs(ageDifference));
   
		scanner.close();
	}
}