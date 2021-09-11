/*Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/

package monika.Assignment_30;

public class ReverseNumber {
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
		ReverseNumber reversenumber=new ReverseNumber();
		reversenumber.reverseNumber(12345);
	}
}
