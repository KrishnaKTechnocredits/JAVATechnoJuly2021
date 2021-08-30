package trupti;

public class Assignment_22 {
	
	int getTotalDigit(String str) {
		int digitCount=0;
		for(int index=0; index<str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				digitCount++;
		}
		return digitCount;
	}
	
	int sumOfDigit(String str) {
		int sumDigit=0;
		for(int index=0; index<str.length();index++) {
			if (Character.isDigit(str.charAt(index)))
				sumDigit +=Character.getNumericValue(str.charAt(index));
			}
		return sumDigit;
	}
	
	public static void main(String[] args) {
		Assignment_22 assignment_22=new Assignment_22();
		String arr= "Te1cg2no3cr4ed3it4s67as";
		System.out.println("total digit: " + assignment_22.getTotalDigit(arr));
		
		String arr1="Te11ch2no3cr4edi2ts4";
		System.out.println("sum of digit: " +assignment_22.sumOfDigit(arr1));
	}
}
