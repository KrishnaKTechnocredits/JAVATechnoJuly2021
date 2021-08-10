package monika;

public class Assignment_7 {
	void simpleInterest(float p, float t, float r) {
		float si;
		si = (p * t * r) / 100;
		System.out.println("Simple Interest is=" + si);
	}

	void temperatureConversion(float fahrenheit) {
		float celcious;
		celcious = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temreture from Fahrenheit to Celcious=" +celcious);
	}

	public static void main(String[] args) {

		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.simpleInterest(8000, 20, 7);
		assignment_7.temperatureConversion(50);
	}

}
