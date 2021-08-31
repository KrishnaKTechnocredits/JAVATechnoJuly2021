/*Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52*/
package sagar_Anasane;

public class CodingTest1 {
	int sum =0;
	
	void sumOfAllDigitsInGivenStringArray(String[] str) {
		for (int index = 0; index<str.length;index++) {
			for (int Nindex = 0; Nindex<str[index].length();Nindex++) {
				char ch = str[index].charAt(Nindex);
				if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				} 
		    }
		}	
		System.out.println("Sum of all Digits available in String Array : " + sum);
	}
	
	public static void main(String[] args) {
		String input[] = {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		CodingTest1 codingTest1 = new CodingTest1();
		codingTest1.sumOfAllDigitsInGivenStringArray(input);
	}
}
