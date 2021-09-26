/* Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family */ 

package akanksha_Jain;

public class Assignment_37 {
	static int max = 0, secondMax=0;

	String[] findMaxNumber(String[] input) {
		int indexNumber = 0;
		for(int index = 0; index<input.length; index++){
			if(input[index].length()>max) {
				max = input[index].length();
				indexNumber = index;
			}	
		}
		input[indexNumber] = "";
		return input;
	}
	
	String findSecondMaxNumber(String[] input) {
		int indexNumber = 0;
		String[] newInput = findMaxNumber(input);
		for(int index = 0; index<newInput.length; index++){
			if(newInput[index].length()>secondMax) {
				secondMax = newInput[index].length();
				indexNumber = index;
			}
		}
		return newInput[indexNumber];
	}
	
	public static void main(String[] args) {
		String str = "Welcome to the family";
		String[] input = str.split(" ");
		Assignment_37 assignment_37 = new Assignment_37();
		assignment_37.findMaxNumber(input);
		System.out.println("The second maximum length word in the string '" + str + "' is " + assignment_37.findSecondMaxNumber(input));
	}
}