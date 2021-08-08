package himanshu;

public class Assignment_6 {

	float SI;
	int Celsius;

	void simpleInterest(int P, int T, float R) {
		SI = (P * T * R) / 100;
		System.out.println("Simple Interest:" + SI);
	}

	void convertTemprature(int fahrenheit) {
		Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Converted Temprature:" + Celsius);
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(2100, 2, 3.6f);
		assignment_6.convertTemprature(47);

	}

}
