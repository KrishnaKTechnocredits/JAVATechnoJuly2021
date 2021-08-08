package husain;

public class Assignment_6 {

	void calcSI(int principal, int term, double rate) {
		double simpInt = principal * term * rate / 100;
		System.out.println("The simple interest for principal " + principal + " ,term " + term + " and rate " + rate
				+ " is: " + simpInt);
	}

	void convertTemp(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("The temperature in fahrenheit " + fahrenheit + " degrees converted to Celsius is: "
				+ celsius + " degrees.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_6 obj = new Assignment_6();
		obj.calcSI(10000, 2, 4.5);
		obj.convertTemp(102.2);
	}

}
