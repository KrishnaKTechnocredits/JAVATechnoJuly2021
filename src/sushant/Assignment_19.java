/*Assignment - 19 : 20th Aug'2021
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

package sushant;

public class Assignment_19 {

	public static void main(String[] args) {
		String inputString = "Hi Techno Credits Hello";
		Assignment_19 assignment_19 = new Assignment_19();
		assignment_19.countOfWordsInGivenString(inputString);
		assignment_19.biggestWordInGivenString(inputString);
		assignment_19.smallestWordInGivenString(inputString);
		String numberString = "10 10 20 30";
		assignment_19.sumOfAllNumbersInString(numberString);
	}

	void countOfWordsInGivenString(String inputString) {
		System.out.println("Input String is :- " + inputString);
		String[] stringArray = inputString.split(" ");
		System.out.println(" Number of words in the given String is :- " + stringArray.length);
	}

	void biggestWordInGivenString(String inputString) {
		String[] stringArray = inputString.split(" ");
		String biggestWord = "";
		for(int index = 0; index < stringArray.length; index ++) {
			if(stringArray[index].length() > biggestWord.length())
				biggestWord = stringArray[index];
		}
		System.out.println(" The biggest word in the given String is :- " + biggestWord);
	}

	void smallestWordInGivenString(String inputString) {
		String[] stringArray = inputString.split(" ");
		String smallestWord = stringArray[0];
		for(int index = 0; index < stringArray.length; index ++) {
			if(stringArray[index].length() < smallestWord.length())
				smallestWord = stringArray[index];
		}
		System.out.println(" The smallest word in the given String is :- " + smallestWord);
	}

	void sumOfAllNumbersInString(String inputString) {
		System.out.println("---------------------------------------------");
		System.out.println("Input String of numbers is :- "+ inputString);
		String[] stringArray = inputString.split(" ");
		int sum = 0;
		for(int index = 0; index < stringArray.length; index ++) {
			int number = Integer.parseInt(stringArray[index]);
			sum += number;
		}
		System.out.println(" The sum of all Numbers in the given String is :- " + sum);

	}

}