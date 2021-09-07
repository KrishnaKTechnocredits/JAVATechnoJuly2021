/* 
 Assignment - 26 : 1st Sep'2021

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable


 */
package harshada.Assignment_26;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_26_01 {
	
	String reverseString (String input) {
		String output= " ";
		for(int index=input.length() - 1 ; index>=0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	

	String [] reversStringArray(String strInput[]) {
		String[] output = new String[strInput.length];
		for (int index = 0; index < strInput.length; index++) {
			output[index] = strInput[(strInput.length - 1) - index];
		}
		return output;
	}
	
	void swapUsingThirdVariable(int num1, int num2) {
		System.out.println("Swap using Third Variable");
		System.out.println("Number1= "+num1);
		System.out.println("Number2= "+num2);
		int temp=0;
		temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("After swapping Numbers are: \nNumber1= " + num1 + "\nNumber2= "+ num2);
		
	}
	
	void swapWithoutUsingThirdVariable(int num1, int num2) {
		System.out.println("Swap Without using Third Variable");
		System.out.println("Number1= "+num1);
		System.out.println("Number2= "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping Numbers are: \nNumber1= " + num1 + "\nNumber2= "+ num2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_26_01 assignment_26_01=new Assignment_26_01();
		String str=assignment_26_01.reverseString("This is technocredits");
		//Program 1
		System.out.println("\n****** Program 1 Output ********\n");
		System.out.println("Reverse String is : " +str);
		String strarray[]={"Credits", "Techno","From","Diwali","Happy"};
		//program 2
		System.out.println("\n****** Program 2 Output ********\n");
		String stroutput[]=assignment_26_01.reversStringArray(strarray);
		System.out.println("Reverse Arary Elements are: " + Arrays.toString(stroutput));
		//program 3
		System.out.println("\n****** Program 3 Output ********");
		assignment_26_01.swapUsingThirdVariable(400,500);
		// program 4
		System.out.println("\n****** Program 4 Output ********");
		assignment_26_01.swapWithoutUsingThirdVariable(100,200);
	}

}
