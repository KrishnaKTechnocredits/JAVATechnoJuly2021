package shyam;

public class ArrayExample1{
	int countOfPositiveNumbers;
	
	int countPositiveNumbers(int[] arrayInput){
		for(int index=0;index < arrayInput.length;index++) {
			if(arrayInput[index] > 0)
				countOfPositiveNumbers++;
		}
		return countOfPositiveNumbers;		
	}
	
	void printCount(){
		System.out.println("Count of Positive numbers in the given array is-->"+countOfPositiveNumbers);
	}
	
	public static void main(String[] args) {
		int[] inputArray = {12,-15,-50,22,11,-91,-15,-14};
		ArrayExample1 arrayExample1 = new ArrayExample1();
		arrayExample1.countPositiveNumbers(inputArray);
		arrayExample1.printCount();
	}
}
