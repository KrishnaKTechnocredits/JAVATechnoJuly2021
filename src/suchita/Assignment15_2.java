package suchita;

class Assignment15_2 {

	int getDifferenceOfEvenOdd(int[] arr) {
		int sumEven =0;
		int sumOdd =0;
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index] % 2 ==0)
				sumEven +=arr[index];
			else
				sumOdd += arr[index];
		}
			return Math.abs(sumEven - sumOdd);
	}
	
	public static void main(String[] args) {
		
		Assignment15_2 assignment = new Assignment15_2();
		int[] arr1 = {12,2,13,9};
		int[] arr2 = {13,22,10,3};
		System.out.println("Difference of sum of given string odd and even numbers :: " + assignment.getDifferenceOfEvenOdd(arr1));
		System.out.println("\n Difference of sum of given string odd and even numbers :: " + assignment.getDifferenceOfEvenOdd(arr2));
		
	}
}