/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.*
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
 */
package atul_K.Assignments.Ass33;

public class Program3 {

	int[] placeNumInOrd(int[] arr) {
		int zcnt = 0;
		int ncnt = 0;
		int[] out =new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			if (arr[index] < 0) {
				ncnt++;
			}else if (arr[index]== 0){
				zcnt++;
			}
		}
		int zi = ncnt-1;
		int ni = 0;
		int pi = ncnt+zcnt;
		for(int index=0;index<arr.length;index++) {
			if (arr[index] < 0) {
				out[ni]=arr[index];
				ni++;
			}else if (arr[index]== 0){
				out[zi]=arr[index];
				zi++;
			}else if(arr[index]>0) {
				out[pi]=arr[index];
				pi++;
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
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		Program3 p3 = new Program3();
		p3.display(p3.placeNumInOrd(input));
	}
}
//time taken: 21 min