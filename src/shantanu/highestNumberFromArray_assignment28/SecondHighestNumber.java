package shantanu.highestNumberFromArray_assignment28;

public class SecondHighestNumber {
	int getSecondHighestNumber(int[] arr) {
		int highestNumber = 0;
		int secondHighestNumber = 0;
		if(arr[0] > arr[1]) {
			highestNumber = arr[0];
			secondHighestNumber = arr[1];
		}
		for(int index = 3; index < arr.length; index++) {
			if(arr[index] > highestNumber) {
				secondHighestNumber = highestNumber;
				highestNumber = arr[index];
			}
			else if(arr[index] > secondHighestNumber) {
				secondHighestNumber = arr[index];
			}		
		}	
		return secondHighestNumber;
	}
	void displaySecondHighestNumber(int[] arr) {
		System.out.println("Second highest number from the array is: "+getSecondHighestNumber(arr));
	}
	public static void main(String[] args) {
		SecondHighestNumber secondHighestNumber = new SecondHighestNumber();
		int[] arr = {10,23,2,11,55,43,99};
		secondHighestNumber.displaySecondHighestNumber(arr);
	}
}
