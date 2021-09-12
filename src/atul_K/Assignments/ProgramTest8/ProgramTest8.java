/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
 */
package atul_K.Assignments.ProgramTest8;

public class ProgramTest8 {
	
	int calculatePairs(int[] arr) {
		int pair =0;
		for(int outerindex=0; outerindex< arr.length-1;outerindex++) {
			int cnt =0;
			for(int index=outerindex; index< arr.length-1;index++) {
				if (index !=outerindex) {
					if(arr[outerindex]== arr[index])
						cnt++;
				}
			}
			pair += (cnt/2);
		}	
		return pair;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		ProgramTest8 t8 = new ProgramTest8();
		System.out.println(t8.calculatePairs(arr));
	} 
}
//time taken: 16 min.
