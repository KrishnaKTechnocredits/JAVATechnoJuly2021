/*Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25*/
package elizabeth;
class CodingTest7{
	
	int getCountOfTriplets(int[] arr){
		int count=0;
		for(int index=0;index<arr.length-2;index++){
			if((arr[index+2]>arr[index+1]) && (arr[index+1]>arr[index])){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		CodingTest7 codingTest7=new CodingTest7();
		int[] input= {10,9,11,12,6,23,25,22,66,34};
		System.out.println("No of triplets in increasing order is " +codingTest7.getCountOfTriplets(input));
	}
}
