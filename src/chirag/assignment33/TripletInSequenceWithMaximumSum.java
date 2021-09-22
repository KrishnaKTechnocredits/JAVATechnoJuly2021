package chirag.assignment33;

import java.util.Arrays;

/*Assignment - 33 : 11th Sep'2021
program 4 : find the triple which in sequence and having maximum sum
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

public class TripletInSequenceWithMaximumSum {
	
	void getTriplet(int [] input) {
		System.out.println("Given input array : "+ Arrays.toString(input));
		int startIndex=0;
		int sum=0;
		int maxSum =0;
		int count=0;
		for(int index = 0;index < input.length-2;index++) {
			if(input[index]==input[index +1]-1 && input[index]==input[index+2]-2) {
				count++;
				System.out.println(input[index]+" "+input[index+1]+" "+input[index+2]);
				sum=input[index]+input[index+1]+input[index+2];
				if(sum > maxSum) {
					maxSum = sum;
					startIndex = index;
				}
			}
		}
		int [] output = new int[3];
		int outputIndex=0;
		for(int index=startIndex;index < startIndex + 3;index++) {
			output[outputIndex]=input[index];
			outputIndex++;
		}
		System.out.println("There are "+count+"consecutive triplets in above array");
		System.out.println("Maximum sum "+sum+" is coming from "+Arrays.toString(output)+" is a triple having maximum sum");
	}
	public static void main(String[] args) {
		TripletInSequenceWithMaximumSum findTriplet=new TripletInSequenceWithMaximumSum();
		int [] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		findTriplet.getTriplet(input);
	}

}
