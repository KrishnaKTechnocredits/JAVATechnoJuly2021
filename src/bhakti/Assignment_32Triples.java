/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/

package bhakti;

public class Assignment_32Triples {
	void findtriplewithMaxSum(int[] arr) {
		
		int Maxsum=0;
		int maxindext=0;
		for (int i=0; i< arr.length-2; i++) {
			if (arr[i]+1== arr[i+1]) {
				if (arr[i+1]+1 == arr[i+2]) {
					System.out.println(arr[i]+ " , "+ arr[i+1]+ " , " +arr[i+2]);
					int sum=arr[i]+arr[i+1]+arr[i+2];
					if(Maxsum<sum) {
						Maxsum=sum;
						maxindext=i;
					}
				}		
					
			}		
		}
		System.out.println("Max sum of triple "+Maxsum);
		System.out.println(arr[maxindext]+ " , "+ arr[maxindext+1]+ " , " +arr[maxindext+2]);
		
	}
	public static void main(String[] args) {
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		Assignment_32Triples assignment_32= new Assignment_32Triples();
		assignment_32.findtriplewithMaxSum(arr);
		
		
	}

}
