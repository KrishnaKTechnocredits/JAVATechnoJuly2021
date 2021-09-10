/*Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/
package sagar_Anasane;

import java.util.Arrays;

public class CodingTest4 {
	int[] shiftAllZerosAtTheEndOfArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int temp = 0;
		for(int index=0;index<arr.length;index++) {
				if(arr[index]!=0) {
					newArr[temp]=arr[index];
					temp++;
				}	
		}
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		CodingTest4 codingTest4 = new CodingTest4();
		codingTest4.shiftAllZerosAtTheEndOfArray(arr);
	}
}
