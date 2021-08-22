package nishi;

import java.util.Scanner;

public class Assignment21 {
	
	int getDifferenceOfMaxAndMinAge(int[] input)
	{
		int max=input[0];
		int min=input[0];
		for(int i =1;i<input.length;i++)
		{
			if(input[i]>max)
			{
				max=input[i];
			}
			else if(input[i]<min)
			{
				min=input[i];
			}
		}
		return max-min;
	}
	
	int[] getAgeFromUser()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many members in family ");
		int length=sc.nextInt();
		System.out.println("Enter family member's ages");
		int[] input=new int[length];
		for(int i=0;i<input.length;i++)
		{
			input[i]=sc.nextInt();
		}
		sc.close();
		return input;		
	}

	public static void main(String[] args) {
		Assignment21 assignment21=new Assignment21();
		int[] input=assignment21.getAgeFromUser();
		System.out.println("Difference of oldest and youngest family memeber is "+assignment21.getDifferenceOfMaxAndMinAge(input));
		
	}

}
