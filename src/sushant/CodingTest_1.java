/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

And I am going to review your code after the session time.
Do not disappoint me.*/

package sushant;

public class CodingTest_1 {

	private int getSumOfString(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				sum+=Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	int getSumOfEachStringFromArray(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			sum+=getSumOfString(input[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		CodingTest_1 codingTest_1 = new CodingTest_1();
		System.out.println("Sum of all the digit available in String array is: "+codingTest_1.getSumOfEachStringFromArray(input));

	}


}