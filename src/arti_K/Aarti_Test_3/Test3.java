/*  Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}  */

package arti_K.Aarti_Test_3;

import java.util.Arrays;

public class Test3 {

	void removeElement(int[] numarr, int no) {
		
		int[] arr = new int[numarr.length-1];
		 int count = 0;
		for(int index = 0; index < numarr.length; index++) {
			
			if(numarr[index] != no) {
				arr[count] = numarr[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public final static void main(String[] args) {
		Test3 t3 = new Test3();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		t3.removeElement(input,14);
	}
}
