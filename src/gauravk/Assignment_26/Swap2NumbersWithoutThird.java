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
public class Swap2NumbersWithoutThird {
	
	void swap2NumWithout3rd(int a, int b) {
		System.out.println("Original sequence --> First number: "+a+" Second number: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped sequence --> First number: "+a+" Second number: "+b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = sc.nextInt();
		new Swap2NumbersWithoutThird().swap2NumWithout3rd(firstNum, secondNum);
	}
}