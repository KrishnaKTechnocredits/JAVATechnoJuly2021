package astha.Assignment14;

public class MaxAndMin {

	void getMaxAndMinNumber(int[] input) {
		int maxNumber = input[0];
		int minNumber = input[0];
		int maxOddNo = input[0];
		int maxEvenNo = input[0];
		for(int index=0; index<input.length ; index++) {
			if(input[index]>maxNumber)
				maxNumber = input[index];
			if(input[index]<minNumber)
				minNumber = input[index];
			if(input[index]%2 == 0 && input[index] > maxEvenNo)
				maxEvenNo = input[index];
			if(input[index]%2 != 0 && input[index] > maxOddNo)
				maxOddNo = input[index];
		}
		System.out.println("Max Number = "+maxNumber);
		System.out.println("Min Number = "+minNumber);
		System.out.println("The difference between maximum number and the minimum number is "+(maxNumber - minNumber));
		System.out.println("The difference between maximum odd number and the maximum even number is "+(maxOddNo - maxEvenNo));
	}
	
	public static void main(String[] args) {
		MaxAndMin maxAndMin = new MaxAndMin();
		int[] inputArr = {1,11,44,23,55,99,23};
		maxAndMin.getMaxAndMinNumber(inputArr);
	}
}
