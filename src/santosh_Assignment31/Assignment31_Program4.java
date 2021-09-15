/*
Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ 
*/

package santosh_Assignment31;

public class Assignment31_Program4 
{

	void checkPerfectNumber(int num) 
	{
		int sum = 1;
		for (int index = 2; index <= num / 2; index++) 
		{
			if (num % index == 0)
				sum += index;
		}
		if (sum == num && num != 1)
			System.out.print(num + " ");
	}

	void perfectNumberInRange()
	{
		for (int index = 40; index <= 170; index++) 
		{
			checkPerfectNumber(index);
		}
	}

	public static void main(String[] args)
	{
		Assignment31_Program4 assignment31_4 = new Assignment31_Program4();
		assignment31_4.perfectNumberInRange();
	}
}
