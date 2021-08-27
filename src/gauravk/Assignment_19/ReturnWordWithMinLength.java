package gauravk.Assignment_19;
/*
 * Assignment - 19 : 20th Aug'2021

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

public class ReturnWordWithMinLength {

	String minLengthWord(String str) {
		String[] arr = str.split(" ");
		String min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min.length()>arr[i].length())
				min = arr[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		System.out.println("Minimum length word from the sentence: "+input+"\nis: "+new ReturnWordWithMinLength().minLengthWord(input));
	}
}