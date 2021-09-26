/*
 Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
 */
package atul_K.Assignments.ProgramTest3;

public class ProgramTest3 {

	void removeElementFromArray(int[] arr, int num) {
		int[] out = new int[arr.length-1];
		int i = 0;
		for(int index=0; index < arr.length;index++) {
			if (num != arr[index]) {
				out[i] = arr[index];
				i++;
			}		
		}
		for(int index=0;index<out.length;index++) {
			System.out.print(out[index]+" ");
		}
	}
	
	public static void main(String[] args) {
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		ProgramTest3 p3 = new ProgramTest3();
		p3.removeElementFromArray(input, 14);
	}
}
//time : 09 min
