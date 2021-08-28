package sushant;

public class Assignment_22 {
	int getDigits(String string) {
		int digitCount=0;
		for(int index=0;index<string.length();index++) {
			char ch=string.charAt(index);
			if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		return digitCount;
	}
	int sumOfDigits(String string) {
		int sum=0;
		for(int index=0;index<string.length();index++) {
			char ch=string.charAt(index);
			if(Character.isDigit(ch)) {
				int temp=Character.getNumericValue(ch);
				sum+=temp;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_22 assignment_22=new Assignment_22();
		System.out.println("Program 1: Total Digits in the given String");
		String str="Te1ch2no3cr4ed3it4s";
		System.out.print("Given string is = " + str);
		System.out.println("\noutput: " +assignment_22.getDigits(str));
		System.out.println("\nProgram 2: Sum of all digits in the given string");
		String str1="Te11ch2no3cr4edi2ts" ;
		System.out.print("Given string is =" + str1);
		System.out.println("\noutput: " +assignment_22.sumOfDigits(str1));	
	}
}
