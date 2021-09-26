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

(Optional) Program 4 : verify given number is a perfect number or not.(sum of its all factor is number it self )

(Optional) Program 5 : verify given number is a perfect square.*/

package bhakti;

public class Assignment_30_2_ArmstrongNumber {
	//Assignment_30_2_ArmstrongNumber	
	//Program 2: Verify whether given number is Armstrong number.
	void checkIfArmstringNumber(int number) {
		int sum=0;
		int num= number;
		
		while (num>0) {
			int newNum=0;
			newNum= num%10;
			sum+= newNum*newNum*newNum;
			num=num/10;
		}
		if (number==sum)
			System.out.println(number+" is Armstrong");
		else 
			System.out.println(number+" is NOT Armstrong");
	}
	
		public static void main (String[] hj) {
			
			Assignment_30_2_ArmstrongNumber obj= new Assignment_30_2_ArmstrongNumber();
			obj.checkIfArmstringNumber(153);
			obj.checkIfArmstringNumber(12);
			
		}
		
}
