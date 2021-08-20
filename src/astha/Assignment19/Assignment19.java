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
output : 70*/

package astha.Assignment19;

import java.util.Scanner;

public class Assignment19 {

	void getWordsFromStatement(String input) {
		String [] arr = input.split(" ");
		System.out.println("The number of words in the statement : " +arr.length);
		String maxLengthWord = arr[0];
		String minLengthWord = arr[0];
		for (int index = 1; index<arr.length;index++) {
			if(arr[index].length() > maxLengthWord.length())
				maxLengthWord = arr[index];
			if(arr[index].length() < minLengthWord.length())
				minLengthWord = arr[index];			
		}
		System.out.println("The word with maximum length :"+maxLengthWord);
		System.out.println("The word with minimum length :"+minLengthWord);	
	}
	
	void getSumOfWords(String input) {
		int sum = 0;
		String [] arr = input.split(" ");
		for (int index=0; index<arr.length;index++) {
			sum += Integer.parseInt(arr[index]);
		}
		System.out.println("The sum of the words :"+sum);
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the statement");
		String inputString1 = scanner.nextLine();
		assignment19.getWordsFromStatement(inputString1);
		System.out.println("Please enter the statement");
		String inputString2 = scanner.nextLine();
		assignment19.getSumOfWords(inputString2);
	}
}
