package genius;

public class Assignment_21 {
	
	int diffOfAgeOfOldestAndYoungerFamilyMember(int[] input) {
		int maxAge = input[0];
		int minAge = input[0];
		for(int index=0;index<input.length;index++) {
			 if(input[index] > maxAge)
				 maxAge=input[index];
			 if(input[index] < minAge)
				 minAge = input[index];
		}
		return maxAge-minAge;
		
	}

	public static void main(String[] args) {
		int[] age = {10,34,38,68,72,95,6}; 
		Assignment_21 assignment_21 = new Assignment_21();
		System.out.println("The difference of Age between oldest and youndest family member is "+assignment_21.diffOfAgeOfOldestAndYoungerFamilyMember(age));
		

	}

}
