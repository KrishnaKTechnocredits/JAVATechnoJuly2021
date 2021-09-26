package shraddha.ArrayExamples;

public class ArrayExample2 {
	int countOfZeros;
	
	public static void main(String[] args) {
		int[] inputArray = {1,0,-11,0,-23,55,0,0};
		ArrayExample2 arrayExample = new ArrayExample2();
		arrayExample.countZeros(inputArray);
		arrayExample.printCount();
	}
	
	int countZeros(int[] arrayInput) {
		for(int index=0;index<arrayInput.length;index++) {
			if(arrayInput[index] == 0)
				countOfZeros++;
		}
		return countOfZeros;
	}
	
	void printCount() {
		System.out.println("Count of Zeros in the given array is "+countOfZeros);
		
	}

}
