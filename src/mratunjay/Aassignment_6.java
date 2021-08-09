package mratunjay;

public class Aassignment_6 {

	double SI = 0.0;
	double celsius = 0.0;

	double simpleinterest(double P, int T, Double R) {

		SI = (P * T * R) / 100;

		return SI;

	}

	double tempchange(double fa) {

		celsius = (fa - 32) * 5 / 9;

		return celsius;

	}

	void display() {

		System.out.println("Simple interest is: " + SI);
		System.out.println("Celsius Temperature  is:  " + celsius);
	}

	public static void main(String[] args) {

		Aassignment_6 A6 = new Aassignment_6();
		A6.simpleinterest(10000, 20, 9.5);
		A6.tempchange(110);
		A6.display();

	}

}
