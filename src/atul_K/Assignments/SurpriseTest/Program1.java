/*
 *WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52
 */
package atul_K.Assignments.SurpriseTest;

public class Program1 {

	int calculateSumOfAlldigitFromStringArr(String[] arr) {
		int sum = 0;
		for(int index=0; index < arr.length; index++) {
			for(int ind=0; ind < arr[index].length();ind++) {
				if (Character.isDigit(arr[index].charAt(ind))) {
					sum +=Character.getNumericValue(arr[index].charAt(ind));
				}	
			}
		}
		return sum;
	}
	
	public static void main(String [] args) {
		String[] arr = {"t2e4c", "2h7no","3h6h2h5", "1mk3", "k9g8"};
		Program1 p1 = new Program1();
		System.out.println(p1.calculateSumOfAlldigitFromStringArr(arr));
	}
	
}
