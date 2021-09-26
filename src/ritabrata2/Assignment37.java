/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package ritabrata2;

public class Assignment37 {
	
	void findSecondLargest(String input) {
		String[] output= input.split(" ");
		String largest="", secondLargest="";
		for (int index=0; index<output.length; index++) {
			if(output[index].length()>largest.length()) {
				secondLargest=largest;
				largest= output[index];
			}
			else if(output[index].length()>secondLargest.length()) {
				secondLargest= output[index];
			}
		}
		System.out.println("The second largest number is: "+secondLargest);
	}
	
	
	public static void main(String[] args) {
		Assignment37 secondLargest= new Assignment37();
		String input= "Welcome to the family";
		secondLargest.findSecondLargest(input);
	}
}
