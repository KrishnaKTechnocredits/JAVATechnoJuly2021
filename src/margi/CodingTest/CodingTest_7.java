package margi.CodingTest;

public class CodingTest_7 {

	//count triplets of increasing numbers
	int countTriplets(int[] input) {
		int count=0;
		int num;
		for(int index=0; index<input.length-2; index++) {
			num=input[index];
			if(num<input[index+1]) {
				if(input[index+1]<input[index+2]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		CodingTest_7 codingTest_7 = new CodingTest_7();
		int[] arr = {10,9,11,6,23,25,22,66,34};
		System.out.println("Total triplets: "+ codingTest_7.countTriplets(arr));
	}
}
