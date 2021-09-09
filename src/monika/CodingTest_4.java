/*Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};
*/
package monika;

import java.util.Arrays;

public class CodingTest_4 {

	void placeAllZeroAtLast(int[] array) {
		int[] output=new int[array.length];
		int count=0;
		for(int index=0; index<array.length; index++) {
			if(array[index]!=0) {
				output[count]=array[index];
				count++;
			}
			
		}
		System.out.println(Arrays.toString(output));		
	}
	public static void main(String[] args) {
		int arr[] = {1,0,0,6,0,2,3,0,4,0,5};
		
		CodingTest_4 test=new CodingTest_4();
		test.placeAllZeroAtLast(arr);
	}
}
