package suchita;

//Test 7

//Count the number of triplets in increasing order
import java.util.Arrays;
class Test7 {

	void findTriplet(int[] input) {
		
		int count = 0;
		int num = 0; 
		System.out.println("\nInput array :: " + Arrays.toString(input));
		for(int index=0; index<input.length-2; index++) {
			num=input[index];
			
			if(num<input[index+1]) {
				if(input[index+1]<input[index+2]) {
					count++;
				}
			}
		}
		System.out.println("\nNumber of triplets present in increasing order : " + count);
	}
	
	public static void main(String[] args) {
		
		Test7 test = new Test7();
		int[] input = {10,9,11,6,23,25,22,66,34};
		test.findTriplet(input);
	}
}