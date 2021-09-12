/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.*
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]
*/
package atul_K.Assignments.Ass33;

public class Program2 {

	int[] arrangeTheNumber(int[] arr) {
		int i=0;
		int j=arr.length-1;
		int[] out = new int[arr.length];
		for(int index=arr.length-1; index >= 0 ;index--) {
			if (arr[index] > 0) {
				out[j] = arr[index];
				j--;
			}
		}
		for(int index=0; index <arr.length;index++) {
			if (arr[index] < 0) {
				out[i]=arr[index];
				i++;
			}
		}
		return out;
	}
	
	void display(int[] arr) {
		for(int index=0;index<arr.length;index++) {
			System.out.print(arr[index]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {1,-3,-2,11,44,55,-76,33,12};
		Program2 p2 = new Program2();
		p2.display(p2.arrangeTheNumber(input));
	}
}
//time taken: 15 min