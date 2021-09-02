package parthav.parthavD_Assignment26;

public class VariableSwap {
	void swapVariableUsingThirdVariable(int num1, int num2) {
		int num3 = 0;
		num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("The swapped variable values are num1: " + num1 + " and num2: " + num2);
	}

	void swapVariableWithoutThirdVariable(int num1, int num2) {

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("The swapped variable values are num1: " + num1 + " and num2: " + num2);

	}

}
