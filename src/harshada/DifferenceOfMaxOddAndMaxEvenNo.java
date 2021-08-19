/*program 4 : print difference between max odd number and max even number from given array. difference should be positive

int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
*/


package harshada;

public class DifferenceOfMaxOddAndMaxEvenNo {
	
	int getMaxEvenNumber(int[] inputArray) {
		int maxEvenNum=inputArray[0];
		for( int i=0 ; i < inputArray.length ; i++) {
			if(inputArray[i] % 2 == 0 && inputArray[i] > maxEvenNum) {
				maxEvenNum=inputArray[i];
				}
			}
			return maxEvenNum;
	}

	int getMaxOddNumber(int[] inputArray) {
		int maxOddNum=inputArray[0];
		for( int i=0 ; i < inputArray.length ; i++) {
			if(inputArray[i] % 2 != 0 && inputArray[i]>=maxOddNum) {
				maxOddNum=inputArray[i];
				}
			}
		return maxOddNum;
	}

	int differenceOfMaxOddEven(int[] inputArray) {
		int oddMax=getMaxOddNumber(inputArray);
		int evenMax=getMaxEvenNumber(inputArray);
		
		
		if (oddMax - evenMax > 0)
			return oddMax - evenMax;
		else
			return evenMax - oddMax;
	}

	public static void main(String[] args) {

		DifferenceOfMaxOddAndMaxEvenNo difference=new DifferenceOfMaxOddAndMaxEvenNo();
		int[] inputArray = {1,11,44,23,55,99,23,22};
		System.out.print("Difference between Maximum Odd Number and Maximum Even Number is: "+difference.differenceOfMaxOddEven(inputArray));
	}

}


