package trupti;

class Calculator {
	int num1 = 10;
	int num2 = 5;

	void add() {
		int sum = num1 + num2;
		System.out.println("sum of 2 nos is " + sum);
	}

	void sub() {
		int subs = num1 - num2;
		System.out.println("substraction of 2 nos is " + subs);
	}

	void mul() {
		int multi = num1 * num2;
		System.out.println("multiplication of 2 nos is " + multi);
	}

	void div() {
		int divi = num1 + num2;
		System.out.println("division of 2 nos is " + divi);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}

}
