
//Assignment about word count ,maximum word length , minimum length, sum of all numbers in given statement
package suchita;

class Assignment19 {

	int getWordCount(String arr) {
		String[] input = arr.split(" ");
		return input.length;
	}
	
	String getMaxWordLength(String arr) {
		String[] input = arr.split(" ");
		String output = input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index].length() > output.length()) {
				output = input[index];
			}
		}
		return output;
	}
	
	String getMinWordLength(String arr) {
		String[] input = arr.split(" ");
		String output =input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index].length() < output.length()) {
				output = input[index];
			}
		}
		return output;
	}
	
	int getSumOfGivenNumbersInArray(String arr) {
		int sum=0;
		String[] input =arr.split(" ");
		for(int index=0;index<input.length;index++) {
			sum += Integer.parseInt(input[index]);
		}	
		return sum;	
	}
	
	public static void main(String[] args) {
		Assignment19 assignment = new Assignment19();
		String input1 = "Hi Techno Credits Hello";
		String input2 = "good morning technocredits hi hello";
		String input3 = "10 10 20 30";
		int output1 = assignment.getWordCount(input1);
		System.out.println("\n Numbers of words in the given statement :: " + output1 );
		String output2 = assignment.getMaxWordLength(input2);
		System.out.println("\nNumbers of maxinum length in the given statement :: " + output2 );
		String output3 = assignment.getMinWordLength(input2);
		System.out.println("\nNumbers of mininum length in the given statement :: " + output3 );
		int output4 = assignment.getSumOfGivenNumbersInArray(input3);
		System.out.println("\n Sum of numbers in the given statement :: " + output4 );
	}
}