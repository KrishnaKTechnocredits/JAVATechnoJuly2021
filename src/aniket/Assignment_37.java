package aniket;

/*
Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.
Example:
Input: Welcome to the family
Output: family
*/
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_37 {

	void getSecondMaxString(String str)
	{
		String[] strArr= str.split(" ");
		String max="";
		String secondMax ="";
		for(int i =0;i<strArr.length;i++)
		{

				if(max.length()<strArr[i].length())
				{
					secondMax=max;
					max= strArr[i];
				}
				else if(secondMax.length()<strArr[i].length() && max.length()!=strArr[i].length())
				 secondMax=strArr[i];
			}
		//System.out.println(max);
		System.out.println("Seconnd MaxLength Word is : "+secondMax);
	}

	public static void main(String[] args) {
		Assignment_37 findSecondMaxString_A37 = new Assignment_37();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String To find Second MaxLength Word : ");
		String str = scan.nextLine();
		findSecondMaxString_A37.getSecondMaxString(str);
		System.out.println("Enter Input String To find Second MaxLength Word : ");
		String str1 = scan.nextLine();
		findSecondMaxString_A37.getSecondMaxString(str1);
	}
}
