package deven_dc.assign;

public class A14_MaxMinDiffEvenOdd {
	void getMaxAndMinNumber(int[] input) {
		int maxNumber = input[0];
		int minNumber = input[0];
		int maxOddNo = input[0];
		int maxEvenNo = input[0];
		for(int index=0; index < input.length ; index++) {
			if(input[index] > maxNumber)
				maxNumber = input[index];
			if(input[index] < minNumber)
				minNumber = input[index];
			if(input[index] % 2 == 0 && input[index] > maxEvenNo)
				maxEvenNo = input[index];
			if(input[index] % 2 != 0 && input[index] > maxOddNo)
				maxOddNo = input[index];
		}
		System.out.println("Maximum Number = "+maxNumber);
		System.out.println("Minimum Number = "+minNumber);
		System.out.println("The Difference Between Max No. & Min No.= "+(maxNumber - minNumber));
		System.out.println("The Difference Between Max Odd No. and Max Even No.= "+(maxOddNo - maxEvenNo));
	}

	public static void main(String[] args) {
		A14_MaxMinDiffEvenOdd a14_maxAndMin = new A14_MaxMinDiffEvenOdd();
		int[] inputArr = {1,11,44,23,55,99,23};
		a14_maxAndMin.getMaxAndMinNumber(inputArr);
	}

}
