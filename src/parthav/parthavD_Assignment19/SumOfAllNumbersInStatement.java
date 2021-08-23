package parthav.parthavD_Assignment19;

public class SumOfAllNumbersInStatement {

	void printSumOfAllNumbers(String inputStr) {
		String[] strArray = inputStr.split(" ");
		int sumOfAllNumbers = 0;

		for (int index = 0; index < strArray.length; index++) {
			sumOfAllNumbers += Integer.parseInt(strArray[index]);
		}

		System.out.println("The sum of all numbers in the passed string is: " + sumOfAllNumbers);

	}

}
