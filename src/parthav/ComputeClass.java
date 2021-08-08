package parthav;

public class ComputeClass {
	double simpleInterest;
	int celsius;

	void simpleInterest(double pAmount, double time, float rate) {
		simpleInterest = ((pAmount * time * rate) * 5) / 9;
		System.out.println("The calculated simple interest is: " + simpleInterest);
	}

	void convertTemperature(int fahrenheit) {
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Fahrenheit " + fahrenheit + " maps to " + celsius + " degree celsius");
	}

	public static void main(String[] args) {
		ComputeClass computeClass = new ComputeClass();
		computeClass.simpleInterest(5000, 2, 4.5f);
		computeClass.convertTemperature(60);
	}
}
