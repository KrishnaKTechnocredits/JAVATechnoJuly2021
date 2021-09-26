/*Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/

package bhakti_CodingTest;

import java.util.Arrays;

public class CodingTest_4 {
	
	void shiftNumber(int[] arr, int n) {
		int[] arrNew= new int[arr.length];
		int x=0;
		int count=0;
		for (int i=0; i<arr.length;i++) {
			
			if(arr[i]!=n) {
				arrNew[x]=arr[i];
				x++;
			}
			else
				count++;
		}
		while (count >0) {
			arrNew[arrNew.length-count]=n;
			count--;
		}
		System.out.println("orginal array " + Arrays.toString(arr));	
		System.out.println("Number to be shift at end-->" +n);
		System.out.println("new array "+ Arrays.toString(arrNew));
		System.out.println("--------------------------------------------------------");
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,6,0,2,3,0,4,0,5};
		CodingTest_4 test4_Coding= new CodingTest_4();
		test4_Coding.shiftNumber(arr, 2);
		test4_Coding.shiftNumber(arr, 0);
		test4_Coding.shiftNumber(arr, 3);
	}
	
}
