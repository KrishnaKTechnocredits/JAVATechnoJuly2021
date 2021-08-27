/*
 Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52
*/
package sayli_Vyavhare;

public class SumOfAllNumInStringArray {

	
	int sumOfDigit= 0;

	int getSumOfAllDigits(String str1) {
        for(int index=0;index<str1.length();index++) {
        	char ch=str1.charAt(index);
            if(Character.isDigit(ch)) {
            	sumOfDigit = sumOfDigit+Character.getNumericValue(ch);
             }
        }
		return sumOfDigit ;
	}
	
	int getCalculatedSum(String input[]) {
		
		for(int index=0;index<input.length;index++) {
			getSumOfAllDigits(input[index]);
		}
		return sumOfDigit;		
	}
	
	
	public static void main(String[] args) {
		 String input[] = {"t2e4c","2h7no", "3h6h2h5", "1mk3", "k9g8"};
		 System.out.println("Sum of all digits in String array is: "+(new SumOfAllNumInStringArray().getCalculatedSum(input)));
	}
}
