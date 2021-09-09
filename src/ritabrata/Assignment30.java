/*Assignment - 30 : 8th Sep'2021
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

(Optional) Program 5 : verify given number is a perfect square.*/


package ritabrata;

public class Assignment30 {
	
	void getReverse(int input) {
		System.out.println("The number is: "+input);
		int reverse=0;
		while (input>0) {
			reverse= reverse*10+ input%10;
			input=input/10;
		}
		System.out.println("The reverse number is: "+reverse);
	}
	
	void getArmstrong(int input) {
		System.out.println("The number is: "+input);
		int check, rem, sum=0;
		check=input;
		while(check!=input) {
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}
		if(sum==input)
			System.out.println("The number: "+input + " is an Armstrong number");	
	}
	
	boolean getPalindrome(int input) {
		int divisor=1;
		while(input/divisor>=10) {
			divisor *=10;
		}
			while(input!=0) {
				int n1=input/divisor;
				int n2= input%10;
				if(n1!=n2) 
					return false;
				input=(input%divisor)/10;
				divisor= divisor/100;
			}
			return true;
	}
	
	void checkPalin(int input) {
		System.out.println("The number is: "+input);
		if(getPalindrome(input))
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not a Palindrome");		
	}
	
	public static void main(String[] args) {
		Assignment30 number= new Assignment30();
		number.getReverse(1932);
		number.getPalindrome(153);
		number.checkPalin(12321);
		number.checkPalin(123);
	}
}
