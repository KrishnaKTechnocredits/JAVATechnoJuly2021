package devendra_Assignment_31;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment31_Perfect_NumnSquare {
	/*P1*/
	void getTripletSequenceCount(int[] arr) {
		int sequenceCount = 0;
		for (int index = 1; index < arr.length - 1; index++) {
			if (arr[index - 1] == (arr[index] - 1) && arr[index + 1] == (arr[index] + 1))
				sequenceCount++;
		}
		if (sequenceCount > 0)
			System.out.println("Number of Triplet Sequences in Array = " + sequenceCount);
		else
			System.out.println("No Consecutive Triplets Present");
	}

	boolean isPerfectNumber(int input) {
		int output = 0;
		for (int index = 1; index < input; index++) {
			if (input % index == 0)
				output += index;
		}
		if (output == input)
			return true;
		return false;
	}
	/*P2*/
	void printPerfectNumbers(int startIndex, int endIndex) {
		boolean flag = true;
		for (int input = startIndex; input <= endIndex; input++) {
			if (isPerfectNumber(input)) {
				System.out.print(input + " ");
				flag = false;
			}
		}
		if (flag)
			System.out.println("No perfect numbers in this range");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment31_Perfect_NumnSquare obj = new Assignment31_Perfect_NumnSquare();
		System.out.println("Count Of Triplet Sequence :- ");
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		System.out.println("Input Array = " + Arrays.toString(arr));
		obj.getTripletSequenceCount(arr);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Perfect Numbers in Given Range :- ");
		System.out.print("Enter a starting number : ");
		int startNum = scanner.nextInt();
		System.out.print("Enter the ending number : ");
		int endNum = scanner.nextInt();
		System.out.print("Perfect Numbers Between "+startNum+" & "+endNum+" = ");
		obj.printPerfectNumbers(startNum, endNum);
	}
}

/*
Assignment31
Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66

Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------

*/