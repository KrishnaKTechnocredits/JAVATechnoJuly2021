package precilla;

public class ArrayProgram10 {
	int evenSum=0,oddSum=0,difference=0;
	void getDifferenceOfSumofevenSumOfOdd(int[] array) {
		for(int index=0;index<array.length;index++) {
			System.out.print(array[index]+" ");
			if((array[index])%2==0)
				evenSum=evenSum+array[index];
			else
				oddSum=oddSum+array[index];	
			if(evenSum>oddSum)
				difference=evenSum-oddSum;
			else 
				difference=oddSum-evenSum;
		}	
	}
	public static void main(String[] args) {
		ArrayProgram10 arrayProgram10=new ArrayProgram10();
		int[] array= {12,2,13,9};
		System.out.print("Given array : ");
		arrayProgram10.getDifferenceOfSumofevenSumOfOdd(array);
		System.out.println("\nDifference between sum of even number and sum of odd numbers : "+arrayProgram10.difference);
	}
}
