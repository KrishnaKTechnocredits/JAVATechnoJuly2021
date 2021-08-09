package amol_Pawar;

public class Assignment_6 {

	void simpleInterest(int p_Amount, int t_Year, double i_Rate) {
		int principle_Amount = p_Amount;
		int year = t_Year;
		double rate = i_Rate;
		double simple_Interest = (principle_Amount * year * rate) / 100;
		System.out.println("Simple Interest of " + principle_Amount + " for " + year + " year is " + simple_Interest);
	}

	void temperatureConversion(int far) {

		int fahrenheit = far;
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature in Celsius is: " + Celsius);

	}

	public static void main(String[] args) {

		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(100000, 1, 7.5);
		assignment_6.temperatureConversion(220);

	}

}
