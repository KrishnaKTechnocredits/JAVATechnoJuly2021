package suruchi;

public class Assignment_6 {
	
	void simpleInterest(double p, double t, double r) {
		double simpleInterest = 0;
		simpleInterest = (p*t*r)/100;
		System.out.println("The simple interest on Rs. " + p +  " is: " + simpleInterest);
	}
	
	void tempConvert(int f) {
		int celsius = 0;
		celsius = (f-32)*5/9;
		System.out.println("The temperature conversion for " + f + "°F to Celsius is: " + celsius + "°C");
	}
	public static void main(String[] a) {
		Assignment_6 assignment6 = new Assignment_6();
		assignment6.simpleInterest(1200,3,8);
		assignment6.tempConvert(58);
	}	
}
	
