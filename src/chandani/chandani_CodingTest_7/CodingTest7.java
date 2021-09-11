package chandani.chandani_CodingTest_7;

public class CodingTest7 {
	
	void getIncreasingTriplets(int[] input) {
		
		int count = 0;
		int num;
		for(int index = 0; index < input.length - 2; index++) {
			num = input[index]; //10
			if(num < input[index+1]) {
				if(input[index+1] < input[index+2]) {
					count++;
					System.out.println("Triplet numbers in increasing order in the given array is/are : " + input[index] + ","
							+ input[index +1] + "," + input[index + 2]);
				}
			}
		}
		System.out.println("Count of sequential triplets " + count);
	}
	
	public static void main(String[] args) {
		CodingTest7 codingTest7 = new CodingTest7();
		int [] arr = {10,9,11,6,23,25,22,66,34};
		codingTest7.getIncreasingTriplets(arr);
	}
}
