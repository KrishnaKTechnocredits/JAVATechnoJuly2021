package indu;

import java.util.Scanner;

public class Assignment_19_3
{
	String findMinWordfromString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String : ");
		String str = scan.nextLine();
		
		String[] arr = str.split("[^a-zA-Z]+");
		String minLength =arr[0];
		for (int index = 0;index < arr.length ;index++)
		{
			if(arr[index].length()<minLength.length())
			{
				minLength = arr[index];
			}
		}
		scan.close();
		return minLength;
	}
	public static void main(String[] ar)
	{
		Assignment_19_3  assignment_19_3 = new Assignment_19_3();
		System.out.println("Min Length word in string is : " + assignment_19_3.findMinWordfromString());
	}
}
