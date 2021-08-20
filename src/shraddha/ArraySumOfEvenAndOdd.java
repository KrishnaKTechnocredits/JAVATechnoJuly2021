package shraddha;

public class ArraySumOfEvenAndOdd {
	
	public static void main(String[] args) {
		int[] inputArray = {12,11,4,5,9,23,5};
		ArraySumOfEvenAndOdd arraySumOfEvenAndOdd = new ArraySumOfEvenAndOdd();
		System.out.println("Difference between sum of even numbers and sum of Odd numbers is :- "+arraySumOfEvenAndOdd.getSumofEvenAndOdd(inputArray));
	}
	
	int getSumofEvenAndOdd(int[] arrayInput) {
		int sumOfEven = 0;
		int sumOfOdd = 0;
		int totalSum = 0;
		for(int index = 0; index < arrayInput.length; index++) {
			if(arrayInput[index] % 2 == 0)
				
				sumOfEven+=arrayInput[index];
			else
				sumOfOdd+=arrayInput[index];
		}
		System.out.println("------------------------------------------");
		System.out.println("Sum of Even numbers in the given array is :- "+sumOfEven);
		System.out.println("Sum of Odd numbers in the given array is :- "+sumOfOdd);
		System.out.println("------------------------------------------");
		if(sumOfEven > sumOfOdd)
			totalSum = sumOfEven - sumOfOdd;
		else
			totalSum = sumOfOdd - sumOfEven;
		return totalSum;
	}

}
