/*program 4 : find the triple which in sequence and having maximum sum*
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
 */
package atul_K.Assignments.Ass33;

public class Program4 {
	void getTripletswithMaxSum(int[] arr) {
		int max =0;
		int i=0;
		for (int index=0;index<arr.length-2;index++) {
			int sum =0;
			if (arr[index] == arr[index+1]-1)
				if(arr[index] == arr[index+2]-2) {
					sum= arr[index]+arr[index+1]+arr[index+2];
				}	
			if (max<sum) {
				max = sum;
				i= index;
			}
		}
		System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
	}
	public static void main(String[] args) {
		int[] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		Program4 p4= new Program4();
		p4.getTripletswithMaxSum(input);
	}
}
//time taken:14 min