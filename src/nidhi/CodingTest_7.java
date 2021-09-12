package nidhi;

/**
Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25

**/

class CodingTest_7{
	
	int noOfTriplet(int[] input){
		int cnt = 0;
		for (int i=0;i<input.length-2;i++){
			if ((input[i+1] > input[i]) && (input[i+2] > input[i+1]))
					cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] ar){
		CodingTest_7 codingtest = new CodingTest_7();
		int[] input = {10,9,11,6,23,25,22,66,34};
		System.out.println(codingtest.noOfTriplet(input));
	}

}
