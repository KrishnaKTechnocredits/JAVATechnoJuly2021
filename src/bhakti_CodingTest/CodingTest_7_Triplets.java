/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

package bhakti_CodingTest;

public class CodingTest_7_Triplets {
	
	void countTriplesIncreasingodrer(int[] input) {
		boolean falg= false;
		for (int i=0; i < input.length-2; i++) {
			if (input[i]<input[i+1] && input[i+1]< input[i+2] ) {
				System.out.println(input[i]+" "+input[i+1]+" "+input[i+2]);
				falg=true;
			}
		}
		if (falg==false)
			System.out.println("No triplets in increasing order");
	}

	public static void main(String[] hjhj) {
		int[] input= {10,9,11,6,23,25,22,66,34};
		int[] input1= {10,9,11,6,28,25,22,66,34};
		CodingTest_7_Triplets test_7= new CodingTest_7_Triplets();
		test_7.countTriplesIncreasingodrer(input);
		test_7.countTriplesIncreasingodrer(input1);
	}
}

