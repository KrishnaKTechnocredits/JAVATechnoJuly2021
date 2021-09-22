/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 
*/package purshottamJoshi;

class CodingTest7{
	
	void numberOfTriplet(int[] input){
		int count=0;
		int number=0;
		for(int index=0; index < input.length/2; index++){
			number =input[index];
			if(number < input[index+1]){
				if(input[index+1] < input[index+2]){
					count++;
					System.out.println("Number of Triplets "+count);
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = {10,9,11,6,23,25,22,66,34};
		CodingTest7 codingtest7 = new CodingTest7();
		codingtest7.numberOfTriplet(arr);
	}
}