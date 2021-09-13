package astha.CodingTest.Test7;

public class TripletsSum {

	int getCountOfTriplets(int[] input) {
		int count = 0;
		for(int index=0; index<input.length-2; index++) {
			if(input[index]<input[index+1] && input[index+1]<input[index+2])
				count++;
		}
	
		return count;
	}
	
	public static void main(String[] args) {
		TripletsSum tripletsSum = new TripletsSum();
		int[] input = {10,9,11,6,23,25,22,66,34};
		int count = tripletsSum.getCountOfTriplets(input);
		if(count == 0)
			System.out.println("There are no triplets present in increasing order in the given array");
		else
			System.out.println("The count of triplets present in increasing order in the given array is "+count);
	}
}
