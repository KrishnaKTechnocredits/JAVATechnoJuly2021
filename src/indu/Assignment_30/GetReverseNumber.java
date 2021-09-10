package indu.Assignment_30;

import java.util.Scanner;

public class GetReverseNumber
{
	int getReverseNumber(int num) 
	{
		int reverseNum=0;
		while(num>0)
		{
		int remainder = num%10;
		reverseNum =reverseNum*10  + remainder;
		num /= 10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		GetReverseNumber obj = new GetReverseNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse : ");
		int num = scan.nextInt();
		System.out.println("Reverse num is :" +obj.getReverseNumber(num));
	}
}
