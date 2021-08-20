package paresh;

public class Assignment6 {

	void simpleIntrest(int P, int T, int R) {
		int simple_Interest = (P * T * R) / 100;
		System.out.println("Simple Intrest : " + simple_Interest);
	}

	void convertTemperature(int fahrenheit) {
		int celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Converted temperture in Celsius : " + celsius);
	}

	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleIntrest(15000, 5, 7);
		assignment6.convertTemperature(79);
	}
}
