package pritiCoding_Tests;

import java.util.Arrays;

public class Coding_Test_3 {
	void removeEleFromArray(int[]input ,int element) {
		int [] output= new int[input.length-1];
		int outputindexcnt=0;
		for (int index=0;index<input.length;index++) {
			if (input[index]!=element) {
				output[outputindexcnt]=input[index];
				outputindexcnt++;
			}
		}
		System.out.println("Output Arrays is :"+Arrays.toString(output));
	}			
		
	public static void main(String[] a) {
		Coding_Test_3 coding_Test_3= new Coding_Test_3();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int element= 14;
		coding_Test_3.removeEleFromArray(input,element);
	}
	
}

/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
*/
