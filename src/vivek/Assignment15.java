package vivek;

public class Assignment15 {
	
	int getEvenOddLengthDifference(String[] input) {
		
		int evenSum=0;
		int oddSum=0;
		for (int index=0; index < input.length ; index++) {
			if(input[index].length()%2==0)
				evenSum+=input[index].length();
			else {
				oddSum+=input[index].length();
			}
		}
		return evenSum-oddSum;
	}
	
	char[] getMiddleCharOfElements(String[] input) {
		
		char[] charArray = new char[3];
		for (int index=0; index< input.length; index++) {
			if (input[index].length()%2==0)
				charArray[index]=input[index].charAt(input[index].length()/2-1);
			else {
				charArray[index]=input[index].charAt(input[index].length()/2);
			}
		}
		return charArray;
	}
	
	int getEvenOddDifference(int[] input) {
		
		int evenSum=0;
		int oddSum=0;
		for (int index=0; index< input.length; index++) {
			if (input[index]%2==0)
				evenSum+= input[index];
			else {
				oddSum+= input[index];
			}
		}
		if (evenSum>oddSum)
			return evenSum-oddSum ;
		else {
			return oddSum-evenSum;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		String[] arr = new String[4];
		arr[0]="Maulik";
		arr[1]="Techno";
		arr[2]="Vivek";
		arr[3]="Patil";
		
		System.out.println("String Even Odd length difference is " + assignment15.getEvenOddLengthDifference(arr));
		
		String[] str = {"hello","techno","credits"};
		
		System.out.println(assignment15.getMiddleCharOfElements(str));
		
		int[] arr1 = {12,2,13,9};
		int[] arr2 = {13,22,10,3};
		
		System.out.println("Number Even odd difference " + assignment15.getEvenOddDifference(arr1));
		System.out.println("Number Even odd difference " + assignment15.getEvenOddDifference(arr2));
		
		
	}

}
