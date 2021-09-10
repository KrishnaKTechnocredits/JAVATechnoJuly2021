/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/
package shalaka.Assignment31;

public class MaxSumOfTriplet {
	void countOfConsecutiveNumbers(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if ((arr[index] + 2) == (arr[index + 1] + 1))
				if ((arr[index] + 2) == (arr[index + 2]))
					count++;
		}
		System.out.println("Count of consecutive numbers in given array is: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		MaxSumOfTriplet countConsecutiveNumbers = new MaxSumOfTriplet();
		countConsecutiveNumbers.countOfConsecutiveNumbers(arr);
	}
}
