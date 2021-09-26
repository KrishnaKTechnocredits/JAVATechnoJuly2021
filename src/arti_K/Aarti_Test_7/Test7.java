/*	Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 
 */
package arti_K.Aarti_Test_7;

public class Test7 {

	int findTripletofIncreasingOrder(int[] arr){
		int count = 0;
		for(int index=0; index < arr.length-2; index++){
			if(arr[index] < arr[index+1]  && arr[index+1] < arr[index+2]){
				count++;
				System.out.println("Triplets in increasing order is : "+arr[index]+","+arr[index+1]+","+arr[index+2]);
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		int[] input = {10,9,11,6,23,25,22,66,34};
		int count = new Test7().findTripletofIncreasingOrder(input);
		System.out.println("Count of triplets in increasing order is : "+count);
	}
}
