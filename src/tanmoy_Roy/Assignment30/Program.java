/*
 * Assignment - 30 : 8th Sep'2021
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

package tanmoy_Roy.Assignment30;
import java.lang.Math;
import java.util.Scanner;

public class Program {
	
	int reverseInteger(int input) {
		int reverse=0;
		while(input>0) {
			reverse=reverse*10+input%10;
			input/=10;
		}
		return reverse;
	}
	
	boolean isArmstrong(int input) {
		int armstrong=0, num=input;
		while(num>0) {
			armstrong+=(int)Math.pow(num%10,3);
			num/=10;
		}
		if (armstrong==input)
			return true;
		else
			return false;
	}
	
	boolean isPerfectSqaure(int input) {
		int sqrt=(int)Math.sqrt(input);
		if( sqrt*sqrt == input )
			return true;
		else
			return false;
	}
	
	boolean isPerfect(int input) {
		
		if(input%2!=0)			//odd numbers are not perfect 
			return false;
		else {
			int sum=1+2;  		//1 and 2 will always be divisor of perfect number
			int k=3;	  		//lets start from 3 and go till input
			while(sum<=input/2) {
				if(input%k==0) {
					sum+=k;
					k=sum;
				}
				else
					k+=1;
			}
			
			if(sum==input)
				return true;
			else
				return false;
		}
	}
	
	

	public static void main(String[] args) {
		Program prg = new Program();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			
			System.out.println("Enter the number to be reversed : ");
			int num = Integer.parseInt(scan.nextLine());
			System.out.println("The Reverse of the entered number :"+ prg.reverseInteger(num));
			
			System.out.println("Enter the number to check Armstrong : ");
			num = Integer.parseInt(scan.nextLine());
			System.out.println("The number entered is Armstrong number :"+ prg.isArmstrong(num));
			
			System.out.println("Enter the number to check Perfect Square : ");
			num = Integer.parseInt(scan.nextLine());
			System.out.println("The number entered is Perfect square number :"+ prg.isPerfectSqaure(num));
			
			System.out.println("Enter the number to check Perfect number: ");
			num = Integer.parseInt(scan.nextLine());
			System.out.println("The number entered is Perfect number :"+ prg.isPerfect(num));
			
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}

}
