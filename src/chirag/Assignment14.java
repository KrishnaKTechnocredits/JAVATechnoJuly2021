package chirag;

public class Assignment14 {

	int getMaxNumberFromArray(int[]num) {
		int maximumNumber = 0;
		for(int index = 0; index < num.length;index++) {
			if(num[index] > maximumNumber)
				maximumNumber = num[index];
		}
		return maximumNumber;
	}
	
	int getMinNumberFromArray(int[] arr) {
		int minimumNumber = arr[0];
		for(int index=0; index < arr.length; index++) {
			if(arr[index] < minimumNumber)
				minimumNumber = arr[index];
			
		}
		return minimumNumber;
	}
	
	int getminimumAndMaximumNumberDiffrence(int [] number) {
		int maximumEven = 0;
		int maximumOdd = 0;
		
		for(int index = 0; index < number.length; index++) {
			if(number[index] % 2 == 0) {
				if(number[index] > maximumEven)
					maximumEven = number[index];
			}
			else if(number[index] > maximumOdd)
				maximumOdd = number[index];
		}
		if(maximumOdd - maximumEven > 0)
			return maximumOdd - maximumEven;
		else
			return maximumEven - maximumOdd;
	}
	public static void main(String[] args) {
		int [] input = {1,11,44,23,55,99,23};
		Assignment14 assignment14 = new Assignment14();
		
		System.out.println("Maximum number from given array : " +assignment14.getMaxNumberFromArray(input));
		
		System.out.println("Minimum number from given array : "+ assignment14.getMinNumberFromArray(input));
	
		System.out.println("Diffrence between maximum even number and maximum odd number from given array : "+assignment14.getminimumAndMaximumNumberDiffrence(input));
	}
}
