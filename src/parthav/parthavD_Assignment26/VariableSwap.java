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

	public static void main(String[] args) {
		VariableSwap newObject = new VariableSwap();
		newObject.swapVariableUsingThirdVariable(10, 15);
		newObject.swapVariableWithoutThirdVariable(5, 8);

	}

}
