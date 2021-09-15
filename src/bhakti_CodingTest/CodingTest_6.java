/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

package bhakti_CodingTest;

public class CodingTest_6 {
	
	void printIncreasingTriples(int[] input) {
		boolean flag= false;
		for (int index =0; index< input.length-2; index++) {
			if (input[index]< input[index+1] && input[index+1]< input[index+2]) {
				System.out.println(input[index]+", " +input[index+1]+", " +input[index+2]);
				flag=true;
			}
			
		}
		if (flag==false) 
			System.out.println("No Triplet found");	
	}
	
	public static void main(String[]dd ) {
		int[] input= {10,9,11,6,23,25,22,66,34};
		int[] input1= {10,9,11,6,26,25,22,66,34};
		CodingTest_6 codingTest_6= new CodingTest_6();
		codingTest_6.printIncreasingTriples(input);
		codingTest_6.printIncreasingTriples(input1);
	}
	


}

