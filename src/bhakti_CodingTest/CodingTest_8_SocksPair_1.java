/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5*/

package bhakti_CodingTest;

public class CodingTest_8_SocksPair_1 {
	void countSockPair(int[] input ) {
		int pair=0;
		
		for (int i=0; i< input.length; i++) {
			int num=input[i];
			int count=0;
			if (num>0) {
				for (int j=0; j< input.length; j++) {
					if (num==input[j])
						count++;
				}
				 
				if (count> 1) {
					pair=pair+ count/2;
				}	
				for (int k=0; k< input.length; k++) {
					if (input [k]==num)
						input[k]=0;
				}
			}	
		}
		System.out.println("Number of pair--> "+pair);
		
	}

	public static void main (String[] h) {
		int[] input= {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		CodingTest_8_SocksPair_1 test_8= new CodingTest_8_SocksPair_1();
		test_8.countSockPair(input);
		
	}
}
