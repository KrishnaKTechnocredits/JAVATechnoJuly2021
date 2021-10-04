package somnath_Assignment_37;
		/*Assignment - 37 : 23th Sep'2021
		WAP to find a second largest word.

		Example:
		Input: Welcome to the family
		Output: family*/


import java.util.Arrays;
import java.util.Scanner;
public class Assignment_37 {
	void SecondMaxString(String str)
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
	
		System.out.println("Second Max Length Word is : "+secondMax);
	}

	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String To find Second MaxLength Word : ");
		String str = scan.nextLine();
		assignment_37.SecondMaxString(str);
		System.out.println("Enter Input String To find Second MaxLength Word : ");
		String str1 = scan.nextLine();
		assignment_37.SecondMaxString(str1);
	}
}
