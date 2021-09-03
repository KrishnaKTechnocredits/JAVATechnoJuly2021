/*Program : 1 
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

package sushant;

public class Assignment26_4 {
	public static void main(String[] args) {
		int x = 25;
		int y = 48;
		System.out.println("Initially Value of 1st Variable is :- " + x);
		System.out.println("Initially Value of 2nd Variable is :- " + y);
		// swapping the value of variables using a temporary variable
		int temp = x;
		x = y;
		y = temp;
		System.out.println("--------------------------------------------");
		System.out.println("After Swapping, Value of 1st variable will be :- " + x);
		System.out.println("After Swapping, Value of 2nd variable will be :- " + y);
	}
}
