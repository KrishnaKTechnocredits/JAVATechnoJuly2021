/*Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52*/

package ritabrata;

public class ScodingTest1 {
	int findSumOfDigits(String input) {
		int sum=0;
		
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(Character.isDigit(ch)) {	
				sum+= Character.getNumericValue(ch);
			}		
		}
		
		return sum;
	}
	
	int getSumOfDigitsFromArray(String[] input) {
		int sum=0;
		ScodingTest1 digit= new ScodingTest1();
		for(int index=0; index<input.length; index++) {
			sum= sum+ digit.findSumOfDigits(input[index]);
		}
		System.out.println("Sum of all the digits are: "+sum);
		return sum;
	}
	public static void main(String[] args) {
		ScodingTest1 digit= new ScodingTest1();		
		String[] input= {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		digit.getSumOfDigitsFromArray(input);
		
		
	}

}

