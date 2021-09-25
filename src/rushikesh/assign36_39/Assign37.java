package rushikesh.assign36_39;
/*
 Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family
 */
public class Assign37 {
	
	void getSecondLargestWord(String ip) {
		String[] arr = ip.split(" ");
		String firstHigest = arr[0];
		String secondHighest = arr[1];/// welcome to the family

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > firstHigest.length()) {
				secondHighest = firstHigest;
				firstHigest = arr[index];
			} else if (arr[index].length() > secondHighest.length()) {
				secondHighest = arr[index];
			}
		}
		System.out.println("Second Highest length word from given string is: " + secondHighest);
	}
	
	public static void main(String[] args) {
		Assign37 assign37= new Assign37();
		String input=" Welcome to the family";
		assign37.getSecondLargestWord(input);
	}
}
