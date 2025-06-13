/* Assignment 15 : 16th Aug'2021
program 1:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
arr[1] = "Techno";
arr[2] = "Nidhi";            	
arr[3] = "Ankit";
output : 2
*/ 

package tarangAssignment15;

public class Assignment_15_Program_1  {
	static int evenLengthName=0, oddLengthName=0;
	
	void findEvenOddLengthName(String[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index].length()%2==0) {
				evenLengthName = evenLengthName + input[index].length();
			}
			else 
				oddLengthName = oddLengthName + input[index].length();
		}
	}
	
	public static void main(String[] args) {
		int diff;
		String[] input = {"Maulik","Techno","Nidhi","Ankit"};
		Assignment_15_Program_1 program1 = new Assignment_15_Program_1();
		program1.findEvenOddLengthName(input);
		diff= evenLengthName - oddLengthName;
		System.out.println("The difference of even length name and odd length name is: " + diff);
	}
}
