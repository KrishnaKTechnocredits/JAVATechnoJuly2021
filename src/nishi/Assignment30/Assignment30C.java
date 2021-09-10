package nishi.Assignment30;

import java.util.Scanner;

public class Assignment30C {
	
	String isPalindrom(int number)
	{
		int rev=new Assignment30A().getReverseOfNumber(number);
		if(rev==number)
			return number +" is a palindrome number";
		else
			return number +" is not a palindrome number";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(new Assignment30C().isPalindrom(num));
		sc.close();
	}
}
