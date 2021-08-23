package astha.Assignment21;

import java.util.Scanner;

public class AgeDifference {

	static int getAgeDifference(int [] inputAge) {
		int maxAge = inputAge[0];
		int minAge = inputAge[0];
		
		for(int index=0; index< inputAge.length; index++) {
			if(inputAge[index] > maxAge)
				maxAge = inputAge[index];
			if(inputAge[index] < minAge)
				minAge = inputAge[index];
		}
			
		return maxAge - minAge;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of family members");
		int count = scanner.nextInt();
		int [] ages = new int [count];
		System.out.println("Enter the "+ count +" family member's age");	
		for (int index=0; index<count;index++){
			ages[index] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("The age difference between oldest and youngest family member : " +getAgeDifference(ages));
	}
}
