/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25*/
package sagar_Anasane;

public class CodingTest7 {
	void countTheNoOfTripletsInIncreasingOrder(int[] arr) {
		boolean flag=false;
		int count=0;
		for(int index=0;index<arr.length-2;index++) {
			if(arr[index]<arr[index+1]) {
				if(arr[index+1]<arr[index+2]) {
					flag= true;
					count++;
				}
			}	
		}
		if(flag) {
			System.out.println("Number of Triplets : "+count);
		}
	}
	
	public static void main(String[] args) {
		int[] input = {10,9,11,6,23,25,22,66,34};
		CodingTest7 codingTest7 = new CodingTest7();
		codingTest7.countTheNoOfTripletsInIncreasingOrder(input);
	}
}
