/*
 Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89
 */
package harshada.ArrayScannerClassPrograms;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment_21 {

	void findtAgeDifference(int intArray[]) {
		int oldestAgeValue=0;
		int youngestAgeValue=intArray[0];
		for(int index=0; index< intArray.length; index++) {
			if(intArray[index]>oldestAgeValue)
				oldestAgeValue=intArray[index];	

			if(intArray[index]<youngestAgeValue)
				youngestAgeValue=intArray[index];
		}
		//System.out.println(youngestAgeValue);

		System.out.println("Difference between Oldest and Youngest Age is =" + (oldestAgeValue-youngestAgeValue));
		System.out.println();
	}
	
	public static void main(String a[]) {
		Assignment_21 assignment_21=new Assignment_21();
		int intArray1[]= {1,2,23,4,5};
		System.out.println("**** Output when Input is Fixed ****");
		assignment_21.findtAgeDifference(intArray1);
		System.out.println("**** Output when Input is taken from user **** ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many members in family ");
		int length=sc.nextInt();
		
		System.out.println("Enter family member's ages");
		int[] intArray2=new int[length];
		for(int index=0;index<intArray2.length;index++)
		{
			intArray2[index]=sc.nextInt();
		}
		assignment_21.findtAgeDifference(intArray2);
		
	    sc.close();
		
	}
}
