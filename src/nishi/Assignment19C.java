package nishi;

import java.util.Scanner;

public class Assignment19C {
	String findMinimumWord(String input)
	{
		String[] output = input.split(" ");
		String min=output[0];
		for(int i=0;i<output.length;i++)
		{
			if(output[i].length()<min.length())
			{
				min=output[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Assignment19C assignment19c=new Assignment19C();
		System.out.println("input = ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Minimum length string is :"+assignment19c.findMinimumWord(input));
		

	}

}
