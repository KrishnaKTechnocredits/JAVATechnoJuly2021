/* Surprise coding test : 26th Aug 2021
WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52
Hint: 6+9+16+4+17 = 52
And I am going to review your code after the session time.
Do not disappoint me.
Timing : 7:45 am to 8:30 am
All the best.
Branch name : yourName_ScodingTest_1
*/

package akanksha_Jain;

public class Surprise_Coding_Test {
	static int sum=0;
	static int number=0;
	
	int getSum(String[] input) {
		for(int index=0; index<input.length; index++) {
			String str = input[index];
			for(int index1=0; index1<str.length(); index1++) {
				char ch = str.charAt(index1);
				if(Character.isDigit(ch)) {
					int number = Character.getNumericValue(ch);
					sum = sum + number;
				}	
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		int answer = new Surprise_Coding_Test().getSum(input);
		System.out.println("The sum of digits in given string is: " + answer);
	}

}
