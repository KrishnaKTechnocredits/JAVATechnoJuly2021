package gauravk.Assignment_26;

import java.util.Scanner;

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
public class Swap2NumbersUsingThird {
	
	void swap2NumUsing3rd(int a, int b) {
		System.out.println("Original sequence --> First number: "+a+" Second number: "+b);
		int x = 0;
		x=a;
		a=b;
		b=x;
		System.out.println("Swapped sequence --> First number: "+a+" Second number: "+b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = sc.nextInt();
		new Swap2NumbersUsingThird().swap2NumUsing3rd(firstNum, secondNum);
	}
}
