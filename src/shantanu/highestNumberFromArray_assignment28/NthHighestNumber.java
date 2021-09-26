package shantanu.highestNumberFromArray_assignment28;

public class NthHighestNumber {
	int[] getHighestNumber(int[] arr) {
		int highest = arr[0];
		int highestIndex = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > highest) {
				highest = arr[index];
				highestIndex = index;
			}
			
		}
		arr[highestIndex] = 0;
		return arr;
	}
	void displayHighestNumber(int[] arr, int order) {	
		int[] newArr = arr;
		int highest = newArr[0];
		while(order > 1){
			newArr = getHighestNumber(arr);
			order--;
		}
		for(int index = 0; index < newArr.length; index++) {
			if(newArr[index] > highest)
				highest = newArr[index];
		}
		System.out.println("Required highest number from array is: "+highest);
	}
	public static void main(String[] args) {
		NthHighestNumber nthHighestNumber = new NthHighestNumber();
		int[] arr = {10,23,2,11,55,43,99};
		nthHighestNumber.displayHighestNumber(arr,3);
	}
}
