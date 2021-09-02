/*
 * Assignment - 26 : 1st Sep'2021

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
package swati.Assignment26;

import java.util.Arrays;

public class ReverseStringAndSwap {
	void findReverseString(String input) {
		String tempStr="";
		for(int index=input.length()-1;index>=0;index--) {
			tempStr=tempStr+input.charAt(index);
		}
		 
		System.out.println("Program1 Output: "+tempStr);
	}
	
	void reverseArray(String[] input) {
		String[] output=new String[input.length];
		int firstIndex=0;
		for(int index=input.length-1;index>=0;index--) {
			output[firstIndex++]=input[index];	
			
		}
		System.out.println("Program2 Output: " + Arrays.toString(output));
		
		}
	void swap2Numbers(int num1,int num2) {
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Program3 Output After Swap:"+ num1 +" "+ num2);
	}
	
	void swap2NoWithoutVariable(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Program4 Output After Swap:"+ num1 +" "+ num2);
	}
	
	public static void main(String[] a) {
		ReverseStringAndSwap reverStrSwap=new ReverseStringAndSwap();
		reverStrSwap.findReverseString("This is technocredits");
		String[] input={"Credits", "Techno","From","Diwali","Happy"};
		reverStrSwap.reverseArray(input);
		reverStrSwap.swap2Numbers(10,20);
		reverStrSwap.swap2NoWithoutVariable(10,20);
	}

}
