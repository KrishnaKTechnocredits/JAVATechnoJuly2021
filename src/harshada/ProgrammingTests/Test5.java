/*
 * Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};


Test 5 :
Find first 5 perfect numbers.

 */
package harshada.ProgrammingTests;

import java.util.Arrays;

public class Test5 {

	void arrangeArrayNumbers() {
		
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		
		System.out.println("Array elements are : " + Arrays.toString(arr));
		int tempArr1[]= new int[arr.length];
		//int tempArr2[]=new int[arr.length];
		int i=0;
		for(int index=0; index<=(arr.length)-1; index++) {
			if(arr[index]!=0) {
				tempArr1[i]=arr[index];
				i++;
				
			}
		}
		System.out.println("Array after arranging Zeros are : " + Arrays.toString(tempArr1));	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test5=new Test5();
		test5.arrangeArrayNumbers();
	}

}
