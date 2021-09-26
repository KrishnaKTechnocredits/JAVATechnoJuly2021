package Rasika_assignment_30;
/*Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/
public class Program1 {

	int getReverseNumber(int number){
		int reverse = 0;
		int remainder =0;
		while(number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number /10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		Program1  program1 = new Program1();
		int number = 1932;
		System.out.println("The reverse number for "+number +" is "+program1.getReverseNumber(number));
	}
}
