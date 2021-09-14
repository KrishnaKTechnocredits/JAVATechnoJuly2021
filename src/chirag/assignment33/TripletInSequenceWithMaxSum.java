package chirag.assignment33;

import java.util.Arrays;

public class TripletInSequenceWithMaxSum {
	
	void getTripletInSequenceWithMaxSum(int [] input) {
		System.out.println("Given array : "+Arrays.toString(input));
		int num1=0;
		int num2=0;
		int num3=0;
		int maxSum=0;
		int sum;
		int count = 0;
		int number1=0;
		int number2=0;
		int number3=0;
		for(int index =0;index < input.length-2;index++) {
			num1=input[index];
			num2=input[index+1];
			num3=input[index+2];
			if(num2 - num1 == 1 && num3 - num2 == 1) {
				count++;
				System.out.println(num1+" "+num2+" "+num3);
				sum = num1+ num2+ num3;
				if(sum > maxSum) {
					maxSum=sum;
					
					number1=num1;
					number2=num2;
					number3=num3;
				}
			}
		}
		System.out.println("there are "+count+" triplets in a given array");
		System.out.println("Maximum sum "+maxSum+" is coming from this triplets "+ number1+" "+number2+" "+number3);	
	}
	public static void main(String[] args) {
		TripletInSequenceWithMaxSum tripletInSequenceWithMaxSum = new TripletInSequenceWithMaxSum();
		int [] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		tripletInSequenceWithMaxSum.getTripletInSequenceWithMaxSum(input);
	}
}