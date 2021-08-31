package genius;

public class Assignment_22 {
	
	int totalDigitsInGivenString(String input) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
			      count++;
		}
		return count;	
		
	}
	
	int sumOfTotalDigitsInGivenString(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
			      sum = sum + Character.getNumericValue(input.charAt(index));
		}
		return sum;	
		
	}
	

	public static void main(String[] args) {
		String str = "Te1ch2no3cr4ed3it4s";
		String str1 = "Te11ch2no3cr4edi2ts";
		Assignment_22 assignment_22 = new Assignment_22();
		int ans= assignment_22.totalDigitsInGivenString(str);
		System.out.println("Number of digit in the given string are : "+ans);
		int sum = assignment_22.sumOfTotalDigitsInGivenString(str1);
		System.out.println("Sum of number of digit in the given string is : "+sum);
	}

}
