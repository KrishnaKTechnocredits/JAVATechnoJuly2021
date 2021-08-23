package nishi;

import java.util.Scanner;

public class Assignment19D {
	int getSumOfNoInStringFormat(String input)
	{
		int sum=0;
		String[] output=input.split(" ");
		for(int i=0;i<output.length;i++)
		{
			sum+=Integer.parseInt(output[i]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment19D assignment19d=new Assignment19D();
		Scanner sc=new Scanner(System.in);
		System.out.println("input = ");
		String input = sc.nextLine();
		System.out.println("Sum of all nos in given Statement is : "+assignment19d.getSumOfNoInStringFormat(input));
	}

}
