/* Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25
*/


package harshada.ProgrammingTests;

import java.util.Arrays;

public class CodingTest7 {

	void getNumberOfTriplets(int arr[]) {
		
		int count=0;
		for(int index=0; index < arr.length-2; index++) {
			int num1= arr[index];
			int num2=arr[index+1];
			int num3=arr[index+2];
			
			if(num2>num1 && num3>num2) {
				count++;
			}
		}
		System.out.println("Number of Triplets in Array : "+ Arrays.toString(arr)+ " is = "+ count);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodingTest7 codingTest7=new CodingTest7();
		int arr[]= {10,9,11,6,23,25,22,66,34};
		codingTest7.getNumberOfTriplets(arr);
	}

}
