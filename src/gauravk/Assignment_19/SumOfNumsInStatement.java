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
public class SumOfNumsInStatement {
	
	int sumOfNumsInString(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			int lengthString=0;
			for(int j=0; j<arr[i].length(); j++) {
				if(Character.isDigit(arr[i].charAt(j)))
						lengthString++;
			}
			if(arr[i].length()==lengthString) {
				sum = sum+ Integer.parseInt(arr[i]);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String input = "10 10 20 30";
		System.out.println("Sum of all numbers from the sentence: "+input+"\nis: "+new SumOfNumsInStatement().sumOfNumsInString(input));
	}
}