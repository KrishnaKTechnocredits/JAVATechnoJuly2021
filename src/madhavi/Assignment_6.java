package madhavi;

public class Assignment_6 {
	void SimpleInterest(float principle, float time, float rate) {
		float SimpleInterest;
		SimpleInterest = (principle * rate * time) / 100;
		System.out.println("Simple Interest is " + SimpleInterest);
	}

	void Temperature(int fahrenheit) {
		int Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature from Fahrenheit to Celsius");
		System.out.println(fahrenheit+"°F = "+Celsius+"°C");
		

	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.SimpleInterest(5000, 1, 11.5f);
		assignment_6.Temperature(35);
	}

}
