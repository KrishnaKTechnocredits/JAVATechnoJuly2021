package manaswi;

public class Assignment30_3 
{

	void isPalindromeNumber(int num) 
	{
		int num1 = num;
		int rnum = 0;
		while (num1 > 0)
		{
			int r = num1 % 10;
			rnum = rnum * 10 + r;
			num1 = num1 / 10;
		}
		if (rnum == num)
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");
	}

	public static void main(String[] args) 
	{
		Assignment30_3 assignment30_3 = new Assignment30_3();
		int num1 = 12321;
		int num2 = 123;
		assignment30_3.isPalindromeNumber(num1);
		assignment30_3.isPalindromeNumber(num2);
	}
}
