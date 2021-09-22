/*
 Test 4 :
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};

 */
package atul_K.Assignments.ProgramTest4;

public class ProgramTest4 {

	void shiftTheZeroAtLastInArray(int[] arr){
		int[] out = new int[arr.length];
		int j =0;
		for(int index=0;index<arr.length;index++) {
			if (arr[index]!=0) {
				out[j] = arr[index];
				j++;
			}
		}
		
		for (int index=0;index<out.length;index++) {
			System.out.print(out[index]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		ProgramTest4 p4 = new ProgramTest4();
		p4.shiftTheZeroAtLastInArray(arr);
	}
}
//time taken: 12 min
