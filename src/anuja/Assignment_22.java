/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13 */

package anuja;

public   class Assignment_22{

	void totalDigits(String str1) {
		int count=0;
		for(int i=0;i<str1.length();i++) {
		char ch=str1.charAt(i);
		if(Character.isDigit(ch)) {
			count++;
		}
	}
	System.out.println("Total digits in a given string is "+ count);
	}
	
	void sumDigits(String str2) {
		int sum=0;
		for(int i=0;i<str2.length();i++) {
		char ch=str2.charAt(i);
		if(Character.isDigit(ch)) {
			sum = sum + Character.getNumericValue(ch);
		}
	}
	System.out.println("Sum of all the digits in a given string is "+sum);
	} 
	
	public static void main(String[] args){
		
		Assignment_22 assignment_22=new Assignment_22();
		String str1= "Te1ch2no3cr4ed3it4s";
		String str2 = "Te11ch2no3cr4edi2ts" ;
		assignment_22.totalDigits(str1);
		assignment_22.sumDigits(str2);
	}
}