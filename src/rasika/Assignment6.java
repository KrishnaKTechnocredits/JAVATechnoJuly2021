package rasika;

public class Assignment6 {
	
	int simpleInterest;
	int celsius;

	void computeSimpleInterest(int principle, int time, int rate) {
		simpleInterest = (principle * time * rate)/100;
		System.out.println("Simple interest is "+simpleInterest);
	}
	void calculateTemp(int fahrenheit) {
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Calculated celsius is "+celsius);
	}
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.computeSimpleInterest(120, 2, 63);
		assignment6.calculateTemp(87);
	}
}
