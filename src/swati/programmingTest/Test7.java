package swati.programmingTest;

/*
 * Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 
 */

public class Test7 {

	int count=0;
	
	int countTriplets(int[] input) {
		for(int index=0;index<input.length-2;index++) {
			int num=input[index];
			if(num<input[index+1]) {
				if(input[index+1]<input[index+2]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] a) {
		Test7 t1=new Test7();
		int[] input= {10,9,11,6,23,25,22,66,34};
		System.out.println("Output: "+ t1.countTriplets(input));
	}

}