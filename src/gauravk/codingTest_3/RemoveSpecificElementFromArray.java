package gauravk.codingTest_3;

import java.util.Arrays;

/*
 * Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}

Branch name
YourName_codingtest_3
 */
public class RemoveSpecificElementFromArray {
	
	int [] removeElementFromArray(int[] arr1, int num1) {
		int[] arr2 = new int[arr1.length-1];
		for(int i=0, j=0; i<arr1.length; i++) {
			if(arr1[i]!=num1) {
				arr2[j]=arr1[i];
				j++;
			}
		}
		return arr2;
	}
	
	public static void main(String[] args) {
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int specificNum = 14;
		System.out.println("After removing specific element "+specificNum+" from array "+Arrays.toString(input)+"\noutput is: "+Arrays.toString(new RemoveSpecificElementFromArray().removeElementFromArray(input, specificNum)));
	}
}
