/*program 2 : place sum of triple after each triple which in sequence.
input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
 */
package atul_K.Assignments.Ass34;

public class Program2 {
	int getTriple(int[] arr) {
		int cnt =0;
		int i;
		for(int index =0; index < arr.length-2;index++) {
			if(arr[index] == arr[index+1]-1)
				if (arr[index] == arr[index+2]-2) { 
					cnt++;
				}
		}
		return cnt;
	}
	
	int[] placeSumAfterTriple(int[] arr) {
		int[] out = new int[getTriple(arr)+ arr.length];
		int i=0;
		for(int index =0; index < arr.length;index++) {
			if(index >2 &&(arr[index-1] == arr[index-2]+1)&& (arr[index-1] == arr[index-3]+2))  {
				out[i] = arr[index-1]+arr[index-2]+arr[index-3];
				out[i+1] = arr[index];
				i+=2;
			}else {
				out[i] = arr[index];
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
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		Program2 p2 = new Program2();
		p2.display(p2.placeSumAfterTriple(input));
	}
}
