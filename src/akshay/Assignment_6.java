package akshay;

public class Assignment_6 {
	
	void simpleInterest(int P, int T, int R) {
		int SI;
		SI = (P * T * R)/100;
		System.out.println("Simple Interest is " + SI);
	}
	
	void tempratureConvert(int fahrenheit) {
		int celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature in celsius is " + celsius);
	}
	
	public static void main(String[] args) {
		Assignment_6 assignment6 = new Assignment_6();
		assignment6.simpleInterest(10000, 2, 10);
		assignment6.tempratureConvert(70);
	}
}
