
/*Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/
package monika;

public class Assignment30_Program_1 {
	void reverseNumber(int number)
	{
		int reverse=0, remainder;
		System.out.println("Given Number is: "+number);
		for(;number!=0;number=number/10) {
			remainder=number%10;
			reverse=reverse * 10 + remainder;
		}
		
		System.out.println("Reverse Number is: "+reverse);
	}
	public static void main(String[] args) {
		Assignment30_Program_1 reversenumber=new Assignment30_Program_1();
		reversenumber.reverseNumber(12345);
	}
}
