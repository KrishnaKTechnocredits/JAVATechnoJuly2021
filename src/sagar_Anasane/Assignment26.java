/*Assignment - 26 : 1st Sep'2021

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
swap 2 numbers without using 3rd variable*/
package sagar_Anasane;

import java.util.Arrays;

public class Assignment26 {
	String reverseGivenString(String inp) {
		for (int index=inp.length()-1;index>=0;index--) {
			char ch = inp.charAt(index);
			System.out.print(ch);
		}
		return inp;
	}
	
	void reverseGivenStringArray(String[] inp) {
		for (int index =inp.length-1; index>=0;index--) {
			String arr = inp[index];
			System.out.println(arr);
		}
	}
	
	void swapTwoNosUsingThirdVariable(int n1,int n2) {
		int number;
		number=n2;
		n2=n1;
		n1=number;
		System.out.println("Values of num1 and num2 after Swapping using Third Variable ="+"\n"+"num1="+n1+"\n"+"num2="+n2);
		
	}
	
	void swapTwoNosWithoutUsingThirdVariable(int n1,int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("Values of num1 and num2 after Swapping Without using Third Variable ="+"\n"+"num1="+n1+"\n"+"num2="+n2);
	}
	public static void main(String[] args) {
		String input1 = "This is technocredits";
		String[] input2 = {"Credits", "Techno","From","Diwali","Happy"};
		int num1 = 5;
		int num2 = 2;
		Assignment26 assignment26 = new Assignment26();
		System.out.print("Reverse String = ");
		assignment26.reverseGivenString(input1);
		System.out.println("\n");
		System.out.print("\n"+"Reverse String Array = "+"\n");
		assignment26.reverseGivenStringArray(input2);
		System.out.println("\n");
		System.out.println("Values of num1 and num2 before Swapping ="+"\n"+"num1="+num1+"\n"+"num2="+num2);
		System.out.println("\n");
		assignment26.swapTwoNosUsingThirdVariable(num1, num2);
		System.out.println("\n");
		assignment26.swapTwoNosWithoutUsingThirdVariable(num1, num2);
	}
}
