/*Program 1 : shift all non zeros at the end.*
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
 */
package atul_K.Assignments.Ass33;

public class Program1 {

	int[] shiftNonZerosAtEnd(int[] arr) {
		int[] out = new int[arr.length];
		int i = arr.length-1;
		for(int index=arr.length-1; index>=0;index--) {
			if (arr[index] != 0) {
				out[i]= arr[index];
				i--;
			}	
		}
		return out;
	}
	
	void display(int[] arr) {
		
		for (int index=0;index<arr.length;index++) {
			System.out.print(arr[index]+" ");
		}
	}
	public static void main(String[] args) {
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		Program1 p1 =new Program1();
		p1.shiftNonZerosAtEnd(input);
		p1.display(p1.shiftNonZerosAtEnd(input));
	}
}
//time taken: 15 min.