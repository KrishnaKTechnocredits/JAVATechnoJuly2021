package chirag.assignment28;
//
//Assignment - 28 : 4th Sep'2021 
//
//Program 1: Find second highest number from array.
//int[] arr = {10,23,2,11,55,43,99};
//output : 55
//
//Program 2: Find nth highest number from array.
//int[] arr = {10,23,2,11,55,43,99};
//input n = 3;
//output : 43
//
//Note : Please watch session recording for hints

public class FindSecondHighestNumber {
	int firstMax = 0;
	int secondMAx = 0;
	void FindSecondHighest(int [] input) {
		
		for(int index = 0 ; index < input.length;index++) {
			if(input[index]>firstMax) {
				firstMax = input[index];
				continue;
			}
	}
		
		System.out.println("First highest number in a given array : "+firstMax);
	}
	void secondHighest(int [] input) {
		for(int index=0;index < input.length;index++) {
			if(input[index] != firstMax) {
				if(input[index] > secondMAx) {
					secondMAx=input[index];
				}
			}
		}
		System.out.println("Second highest number in a given array : "+secondMAx);
	}
	public static void main(String[] args) {
		FindSecondHighestNumber findSecondHighestNumber = new FindSecondHighestNumber();
		int[] arr = {10,23,2,11,55,43,99};
		findSecondHighestNumber.FindSecondHighest(arr);
		findSecondHighestNumber.secondHighest(arr);
	}
}