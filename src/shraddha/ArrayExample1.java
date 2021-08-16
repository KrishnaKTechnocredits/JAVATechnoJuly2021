package shraddha;

public class ArrayExample1 {
	int countOfPositiveNumbers;
	
	public static void main(String[] args) {
		int[] inputArray = {1,-11,-44,23,55,-99,-23,-22};
		ArrayExample1 arrayExample = new ArrayExample1();
		arrayExample.countPositiveNumbers(inputArray);
		arrayExample.printCount();
		
	}
	
	int countPositiveNumbers(int[] arrayInput){
		for(int index=0;index < arrayInput.length;index++) {
			if(arrayInput[index] > 0)
				countOfPositiveNumbers++;
		}
		return countOfPositiveNumbers;		
	}
	
	void printCount() {
		System.out.println("Count of Positive numbers in the given array is "+countOfPositiveNumbers);
		
	}

}
