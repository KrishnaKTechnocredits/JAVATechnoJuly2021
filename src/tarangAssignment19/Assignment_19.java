/* Assignment - 19 : 20th Aug'2021
program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4
 
program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70
*/

package tarangAssignment19;

public class Assignment_19 {

	void getWordsFromString(String input) {
		String[] arr = input.split(" ");
		System.out.println("Number of words in a string '" + input + "' is- " + arr.length);
	}
	
	void getMaxLengthWordFromString(String input) {
		String[] arr = input.split(" ");
		String maxLengthWord = null;
		int count=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index].length()>count) {
				count = arr[index].length();
				maxLengthWord = arr[index];
			}
		}
		System.out.println("The maximum length word from given string '" + input + "' is- " + maxLengthWord);
	}
	
	void getMinLengthWordFromString(String input) {
		String[] arr = input.split(" ");
		String minLengthWord = null;
		int count=100;
		for(int index=0; index<arr.length; index++) {
			if(arr[index].length()<count) {
				count = arr[index].length();
				minLengthWord = arr[index];
			}
		}
		System.out.println("The minimum length word from given string '" + input + "' is- " + minLengthWord);
	}
	
	void sumStringNumbers(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		for(int index=0; index<arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		System.out.println("The sum of all numbers in given string '" + input + "' is- " + sum);
	}
	
	public static void main(String[] args) {
		String input = "Hi Techno Credits Hello";
		String input1 = "good morning technocredits hi hello";
		String input2 = "10 10 20 30";
		Assignment_19 assignment_19 = new Assignment_19();
		assignment_19.getWordsFromString(input);
		assignment_19.getMaxLengthWordFromString(input1);
		assignment_19.getMinLengthWordFromString(input1);
		assignment_19.sumStringNumbers(input2);
	}
}
