package gauravk.Assignment_30;
/*
 *  Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391

Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number

Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number

input : 123
output : 123 is not an Palindrome number.

(Optional) Program 4 : verify given number is a perfect number or not.

(Optional) Program 5 : verify given number is a perfect square.
 */
public class CheckNumberIsArmstrongNum {
	
	String isArmstrongNum(int num) {
		int remainder = 0;
		int sumOfCubes=0;
		int inputStorer=num;
		while(num>0) {
			remainder = num%10;
			sumOfCubes += (remainder*remainder*remainder);
			num = num/10;
		}
		if(inputStorer==sumOfCubes)
			return "Armstrong";
		else
			return "NOT Armstrong";
	}
	
	public static void main(String[] args) {
		int input = 153;
		System.out.println("The number "+input+" is "+new CheckNumberIsArmstrongNum().isArmstrongNum(input));
	}
}
