/* Assignment - 31 : 9th Sep'2021
Program 3:
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
	   24,25,26
	   64,65,66
*/

package akanksha_Jain.Assignment_31;

import java.util.Arrays;

public class Program_3_TripleSequenceCount {

	void findCountTripleSeq(int[] arr) {
		int count=0;
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index+1]+1) {
				count ++;
			}
		}
		System.out.println("The count of triple sequence in " + Arrays.toString(arr) + " are " + count);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		Program_3_TripleSequenceCount tripleSeqCount = new Program_3_TripleSequenceCount();
		tripleSeqCount.findCountTripleSeq(arr);
	}
}
