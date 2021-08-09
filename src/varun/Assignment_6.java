package varun;

public class Assignment_6 {
	float simpleInterestResult;
	int celcius;

	void calculateInterest(int principal, float rate, int time) {
		simpleInterestResult = (principal * rate * time) / 100;
	}

	void temperature(int fahrenheit) {
		celcius = (fahrenheit - 32) * 5 / 9;
	}

	void display() {
		System.out.println("Calculation of simple interest is " + simpleInterestResult);
		System.out.println("Temperature is " + celcius);
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.calculateInterest(5000, 5.75f, 3);
		assignment_6.temperature(52);
		assignment_6.display();
	}

}
