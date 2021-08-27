package shweta_Dharmadhikari.coding_test;

import java.util.Scanner;

/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52*/
public class SumOfAllDigitsFromStringArray {

	
		int sumOfDigits(String input) {
			int stringSum =0;
			for (int index = 0; index<input.length();index++) {
				//char ch=input.charAt(index);
				if(Character.isDigit(input.charAt(index))) {
					stringSum += Character.getNumericValue(input.charAt(index)); 
				}
			}
			return stringSum;
		}
		
		int sumOfDigitsInArray(String arr[]) {
			int arraySum=0;
			for (int index = 0; index<arr.length;index++) {
				arraySum+=sumOfDigits(arr[index]);
			}	
			return arraySum;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] input=new String[30];
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		SumOfAllDigitsFromStringArray sumOfAllDigitsFromStringArray = new SumOfAllDigitsFromStringArray();
		System.out.println("sum of all the digit is : "+sumOfAllDigitsFromStringArray.sumOfDigitsInArray(input));
		}

}
