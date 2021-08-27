package suchita;

class Assignment22 {

	// total numbers of digits in the given string
	int getTotalDigits(String arr) {
		int count = 0;
		for(int index=0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				count++;
		}
		return count;
	}
	
	//sum of all the digits in the given string
	int getSumOfAllTheDigitsInString(String arr){
		
		int sum = 0;
		for(int index=0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				sum += Character.getNumericValue(arr.charAt(index));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Assignment22 assignment = new Assignment22();
		String input = "Te1ch2no3cr4ed3it4s";
		int count = assignment.getTotalDigits(input);
		System.out.println("\n Total digits in "+ input + "::" + count);
		String input2 = "Te11ch2no3cr4edi2ts";
		int sum = assignment.getSumOfAllTheDigitsInString(input2);
		System.out.println("\n Sum of all the digits given in the string " + input2 + "::" + sum);
	}
}