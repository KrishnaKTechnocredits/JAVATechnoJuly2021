/* Assignment 15 : 16th Aug'2021

*program 1*:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";	
arr[1] = "Techno";	
arr[2] = "Nidhi";		
arr[3] = "Ankit";

output : 2

program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

Hint : charAt method of String class helps to retrieve character on given index

program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}

hint : 22 - 14 = 8
output : 8
*/

package astha.Assignment15;

public class StringArray {

	int diffOfEvenAndOddLength(String[] input) {
		int evenLength =0;
		int oddLength = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index].length()%2 ==0)
				evenLength += input[index].length();
			else
				oddLength += input[index].length();
		}
		return evenLength-oddLength;
	}
	
	char[] returnMiddleCharacter(String[] input) {
		char [] output = new char[4];
		for(int index=0; index < input.length; index++) {
			output[index] = input[index].charAt((input[index].length())/2);
		}
		return output;
	}
	
	int diffOfSumOfEvenAndOddNumber(int [] input) {
		int evenSum = 0;
		int oddSum = 0;
		int diff = 0;
		for (int index= 0; index<input.length;index++) {
			if(input[index]%2 == 0)
				evenSum += input[index];
			else
				oddSum += input[index];
		}
		if(evenSum > oddSum)
			diff = evenSum - oddSum;
		else
			diff = oddSum - evenSum;
		return diff;
	}
	
	public static void main(String[] args) {
		StringArray stringArray = new StringArray();
		int [] inputArray = {13,22,10,3,31};
		System.out.println("The difference between sum of even number - sum of odd numbers is : "+stringArray.diffOfSumOfEvenAndOddNumber(inputArray));
		String [] inputArr = {"Maulik","Techno","Nidhi","Ankit"};
		System.out.println("The difference of even length name and odd lenght name is : "+stringArray.diffOfEvenAndOddLength(inputArr));
		char[] outputArr = stringArray.returnMiddleCharacter(inputArr);
		System.out.println("Middle character of each element in the array ");
		for(int index=0; index<outputArr.length; index++ ) {
			System.out.print(outputArr[index]+" ");
		}
	}
}
