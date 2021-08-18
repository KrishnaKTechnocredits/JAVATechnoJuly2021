package rasika;

public class Assignment13 {
	int countOfPositiveNumbers = 0;
	int countOfZeroes = 0;

	int toGetPositiveNumbers(int[] input) {
		for(int index = 0 ; index <= input.length-1; index++){
			if(input[index] > 0) 
				countOfPositiveNumbers++;
	}
	return countOfPositiveNumbers;
	}
	
	int getTotalZerosInArray(int[] input) {
		for(int index = 0 ; index < input.length; index++){
			if(input[index] == 0) 
				countOfZeroes++;
	}
	return countOfZeroes;
	}
	
	int[] get5SmallerNumbers(int number) {
		int[] arrayOfSmallerNumbers = new int[5]; 
		for(int index = 0; index <5;index++) {
			number--;
			arrayOfSmallerNumbers[index] = number;
			System.out.println(arrayOfSmallerNumbers[index]);
		}
		return arrayOfSmallerNumbers;
	}
	
	public static void main(String[] args) {
		int[] array1 = {1,-11,-44,23,55,-99,-23,-22};
		Assignment13 assignment13 = new Assignment13();
		System.out.println("Total positive numbers in array are "+assignment13.toGetPositiveNumbers(array1));
		int[] array2 = {1,-11,0,0,55,0,-23,0};	
		System.out.println("Total number of zeros in array are "+assignment13.getTotalZerosInArray(array2));
		System.out.println(assignment13.get5SmallerNumbers(50));
		
	
	}
}
