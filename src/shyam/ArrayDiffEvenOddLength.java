package shyam;

public class ArrayDiffEvenOddLength {
	
	int difference;
	public static void main(String[] args) {
		String[] str = {"Difference","between","even","ODD","Length","Example","Array"};
		ArrayDiffEvenOddLength arrayDifference = new ArrayDiffEvenOddLength();
		
		arrayDifference.getDifference(str);
		
		System.out.println("difference of even length name and odd lenght name in the given array is : "+arrayDifference.difference);
	}

	int getDifference(String[] arrayInput) {
		int evenStringLength = 0;
		int oddStringLength = 0;
		for(int index=0;index<arrayInput.length;index++) {
			if(arrayInput[index].length() % 2 == 0)
				evenStringLength += arrayInput[index].length();
			else
				oddStringLength += arrayInput[index].length();
		}
		
		if(evenStringLength > oddStringLength)
			difference = evenStringLength - oddStringLength;
		else
			difference = oddStringLength - evenStringLength;
		
		System.out.println("Even String length in the given String Array is : "+evenStringLength);
		System.out.println("Odd String length in the given String Array is : "+oddStringLength);
				
		return difference;
	}
}