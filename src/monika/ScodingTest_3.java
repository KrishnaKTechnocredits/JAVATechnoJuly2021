/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/
package monika;

import java.util.Arrays;

public class ScodingTest_3 {

	void getRemoveSpecificElementFromArray(int[] arr1,int element) {
		
		int[] arr2=new int[arr1.length-1];
		int index1=0;
		for(int index=0; index<arr1.length;index++) {
			if(arr1[index]!=element) {
				arr2[index1]=arr1[index];
				index1++;
			}
		}
		System.out.println("After removing specific element: "+Arrays.toString(arr2));
	}
	public static void main(String[] args) {
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Given Array is: "+Arrays.toString(input));
		ScodingTest_3 scodingTest_3=new ScodingTest_3();
		scodingTest_3.getRemoveSpecificElementFromArray(input, 14);
	}
}
