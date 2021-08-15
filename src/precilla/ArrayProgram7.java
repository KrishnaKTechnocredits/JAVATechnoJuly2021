package precilla;

public class ArrayProgram7 {
	int getDiffBetwnMaxOddAndMaxEvenNos(int[] array) {
		int index=0,difference=0;
		int maximum=array[index];
		int oddNumbers=0,evenNumbers=0;
		for(index=0;index<array.length;index++)
		{
			System.out.print(array[index]+" ");
			if(array[index]>maximum) {
				maximum=array[index];
				if(maximum%2==0)
					evenNumbers=array[index];
				else
					oddNumbers=array[index];
			}
		}
		difference = oddNumbers-evenNumbers;
		return difference;
	}
	public static void main(String[] args) {
		ArrayProgram7 arrayProgram7=new ArrayProgram7();
		int[] array= {1,11,44,23,55,99,23};
		System.out.print("Given array:");
		System.out.println("\nDifference between maximum odd number and maximum even numbers from given array :"+arrayProgram7.getDiffBetwnMaxOddAndMaxEvenNos(array));
	}

}
