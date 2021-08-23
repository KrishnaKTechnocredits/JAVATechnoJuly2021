package indu;

import java.util.Scanner;

public class Assignment_19_2 
{
	String findMaxWordfromString()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String : ");
		String str = scan.nextLine();
		String maxLength ="";
		String[] arr = str.split("[^a-zA-Z]+");
		for (int index = 0;index < arr.length ;index++)
		{
			if(arr[index].length()>maxLength.length())
			{
				maxLength = arr[index];
			}
		}
		scan.close();
		return maxLength;
	}
	public static void main(String[] ar)
	{
		Assignment_19_2  assignment_19_2 = new Assignment_19_2();
		System.out.println("Max Length word in string is : " + assignment_19_2.findMaxWordfromString());
	}
}
