package rasika;

public class Assignment15 {
	int countOfEvenString = 0;
	int countOfOddString = 0;
	int[] array = {12,2,13,9};
	int[] array1 = {13,22,10,3};
	int getDiffBetweenEvenAndOddLengthString(String[] array) {
		for(int index = 0; index < array.length; index++) {
			if(array[index].length() % 2 == 0) {
				countOfEvenString = countOfEvenString +  array[index].length();
			}
			else {
				countOfOddString = countOfOddString + array[index].length();
			}
		}
		return countOfEvenString - countOfOddString ;
	}
	char getMiddleChar(String input) { 
		int middleIndex = input.length()/2;
		return input.charAt(middleIndex);	
	}
	
	int diffBetweenSumOfEvenAndOdd(int[] input){
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] % 2 == 0) {
				sumOfEven = sumOfEven + input[index];
			}
			else {
				sumOfOdd = sumOfOdd + input[index];
			}
		}
		if(sumOfEven > sumOfOdd) 
		return sumOfEven - sumOfOdd;
		else
		return sumOfOdd - sumOfEven;
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		String[] string = {"Maulik","Techno","Nidhi","Ankit"};
		System.out.println("The difference between count of even string and odd string is "+assignment15.getDiffBetweenEvenAndOddLengthString(string));
		System.out.println("The middle string is "+assignment15.getMiddleChar("Nitin"));
		System.out.println(assignment15.diffBetweenSumOfEvenAndOdd(assignment15.array));
		System.out.println(assignment15.diffBetweenSumOfEvenAndOdd(assignment15.array1));
	}
}
