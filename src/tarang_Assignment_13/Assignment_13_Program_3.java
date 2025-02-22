package tarang_Assignment_13;

/* Assignment 13 : 15th Aug'2021
program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45
*/


public class Assignment_13_Program_3 {	
	

	void getSmallerNumbers(int input) {
		int output[] = new int[5];
		System.out.println("5 smaller numbers from the number " + input + " are:- ");
		for(int index=0; index<5; index++) {
				input --;
				output[index] = input;
				System.out.println(output[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment_13_Program_3 program3 = new Assignment_13_Program_3();
		program3.getSmallerNumbers(50);
	}

}
