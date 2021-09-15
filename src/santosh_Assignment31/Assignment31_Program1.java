/*
Assignment - 31 : 
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number
*/
package santosh_Assignment31;

public class Assignment31_Program1 
{

	void checkPerfectNumber(int num)
	{
		int sum = 1;
		for (int index = 2; index <= num / 2; index++)
		{
			if (num % index == 0)
				sum += index;
		}
		if (sum == num)
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");
	}

	public static void main(String[] args)
	{
		Assignment31_Program1 assignment31_1 = new Assignment31_Program1();
		int num1 = 6;
		int num2 = 50;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		assignment31_1.checkPerfectNumber(num1);
		assignment31_1.checkPerfectNumber(num2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
} 
 

 


