package ramkrishna;

class Calculator {
	int x = 10;
	int y = 5;

	void add() {
		int addAnswer = x + y;
		System.out.println("Addition of two Number is " + addAnswer);
	}

	void sub() {
		int subAnswer = x - y;
		System.out.println("Subtraction of two Number is " + subAnswer);
	}

	void mul() {
		int mulAnswer = x * y;
		System.out.println("Multification of two Number " + mulAnswer);
	}

	void div() {
		int divAnswer = x / y;
		System.out.println("Divison of two number " + divAnswer);
	}

	public static void main(String[] args) {
		Calculator C1 = new Calculator();
		C1.add();
		C1.sub();
		C1.mul();
		C1.div();
	}

}