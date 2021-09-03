package indu;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingSpecificElements_test_3 {
	
	int[] removingSpecificElement(int num[] ,int toRemove)
	{
		int output[] = new int[num.length-1];
		int outputIndex=0;
		for(int index=0;index<num.length;index++)
		{
			if(toRemove!=num[index])
			{
				output[outputIndex]=num[index];
				outputIndex++;
			}
		}
		return output;
	}
	
	public static void main(String[] arf)
	{
		RemovingSpecificElements_test_3 removingSpecificElements = new RemovingSpecificElements_test_3();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Input Array  : "+Arrays.toString(input));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Specific number to remove from Array: ");
		int num = scan.nextInt();
		System.out.println("Output Array : "+Arrays.toString(removingSpecificElements.removingSpecificElement(input,num)));
	}
}
