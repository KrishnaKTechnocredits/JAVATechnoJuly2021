package indu;

import java.util.Scanner;

public class Assignment_19_4
{
	int findSumofNUmbersfromString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String : ");
		String str = scan.nextLine();
		
		String[] arr = str.split("[^0-9]+");
		int sum =0;
		
		for (int index = 0;index < arr.length ;index++)
		{

			sum += Integer.parseInt(arr[index]);
		}
		scan.close();
		return sum;
	}
	public static void main(String[] ar)
	{
		Assignment_19_4  assignment_19_4 = new Assignment_19_4();
		System.out.println("Sum of all numbers in string is : " + assignment_19_4.findSumofNUmbersfromString());
	}
}
