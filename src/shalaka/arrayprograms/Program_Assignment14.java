package shalaka.ArrayPrograms;

public class Program_Assignment14 {

	int getDiffEvenAndOdd() {
		int[] arr = { 1, 11, 44, 23, 55, 99, 23, 22 };
		int evenMaxNumber = arr[0];
		int oddMaxNumber = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0 && arr[index] > evenMaxNumber)
				evenMaxNumber = arr[index];

			else if (arr[index] % 2 != 0 && arr[index] > oddMaxNumber)
				oddMaxNumber = arr[index];
		}

		if (evenMaxNumber > oddMaxNumber)
			return evenMaxNumber - oddMaxNumber;
		else
			return oddMaxNumber - evenMaxNumber;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_Assignment14 program_Assignment14 = new Program_Assignment14();
		int difference = program_Assignment14.getDiffEvenAndOdd();
		System.out.println("The difference between max odd number and max even number is: " + difference);

	}
}
