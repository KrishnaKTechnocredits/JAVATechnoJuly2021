/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}

Branch name
YourName_codingtest_3*/

package ritabrata;

import java.util.Arrays;

public class CodingTest3 {
	int[] getString(int[] input, int eject) {
		int[] output =new int[input.length-1];
		for(int index=0,j = 0; index<input.length; index++) {	
			if(input[index]!=eject) {
				output[j]=input[index];
				j++;
			}	
		}
		return output;
	}

	public static void main(String[] args) {
		CodingTest3 test=new CodingTest3();
		int arr[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		test.getString(arr, 14);
		System.out.println(Arrays.toString(test.getString(arr, 14)));
	}

}
