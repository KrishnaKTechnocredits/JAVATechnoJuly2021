/*Assignment 15 : 16th Aug'2021


program 1:  wap that will return difference of even length name and odd length name.
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

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16
*/

package harshada;

public class Assignment_15 {
	
	int evenLengthSum;
	int oddLengthSum;
	char middleChar;
	
	void findDifferenceOfSumInString(String arrayStr[]) {
		
		for(int index=0; index< arrayStr.length; index++) {
			
			if(arrayStr[index].length() % 2==0) {
				evenLengthSum=evenLengthSum+arrayStr[index].length();
			}
			else {
				oddLengthSum=oddLengthSum+arrayStr[index].length();	
			}
		}
		
			System.out.println("EvenLengthSum="+evenLengthSum);
			System.out.println("OddLengthSum="+oddLengthSum);
			if(oddLengthSum>evenLengthSum) {
				System.out.println("Difference of even length name and odd lenght name= "+ (oddLengthSum-evenLengthSum));
			}
			else {
			System.out.println("Difference of even length name and odd lenght name= "+ (evenLengthSum-oddLengthSum) + "\n");
			}
	}
	
	void getMiddleCharOfString(String arrayStr[]){
		
		int middleIndex=0;
		for(int index=0; index< arrayStr.length; index++) {
			
			middleIndex=( arrayStr[index].length() ) /2;
			//if String has even length
			if(arrayStr[index].length() % 2 == 0) {
				middleIndex--;
				System.out.println("Middle element of String "+ index + " is "+ arrayStr[index].charAt(middleIndex));
			}
			//if String has odd length
			else {
				System.out.println("Middle element of String "+ index + " is "+ arrayStr[index].charAt(middleIndex));
			}
		}		
	}
	// Program 3 code
	void getDifferenceOfSumFromNumbers(int input1[]) {
		int evenSum=0;
		int oddSum=0;
		for(int index=0; index< input1.length ; index++) {
			if(input1[index] % 2 == 0) {
				evenSum=evenSum+input1[index];
			}
			else {
				oddSum=oddSum+input1[index];
			}
		}
		if(oddSum > evenSum) {
			System.out.println("Difference of sum of Even numbers and Odd Numbers = "+ (oddSum-evenSum));
		}
		else {
			System.out.println("Difference of sum of Even numbers and Odd Numbers = "+ (evenSum-oddSum));
		}
	}
	public static void main(String a[]) {
		Assignment_15 assignment_15=new Assignment_15();
		String arrayStr[]= {"Harshada","Shubhada","Aryaa", "Lilly"};
		// Calling findDifference() to execute program 1 objective
		System.out.println("*** Output of Program 1 : ***");
		assignment_15.findDifferenceOfSumInString(arrayStr);
		System.out.println("*** Output of Program 2 : *** ");
		assignment_15.getMiddleCharOfString(arrayStr);	
		int[] arr1 = {12,2,13,9};
		int[] arr2 = {13,22,10,3};

		System.out.println("\n*** Output of Program 3 : ***");
		assignment_15.getDifferenceOfSumFromNumbers(arr1);
		assignment_15.getDifferenceOfSumFromNumbers(arr2);
	
	}
}
