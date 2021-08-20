package akanksha_Jain;

public class Assignment_19 {

	void getWordsFromString(String input) {
		int count = 0;
		for(int index=0; index<input.length()-1; index++) {
			char ch = input.charAt(index);
			if (ch == ' ')
				count ++;
		}
		System.out.println("Number of words in a string '" + input + "' is- " + ++count);
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
