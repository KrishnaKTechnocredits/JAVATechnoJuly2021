//Assignment 6 DATE: 08/07/2021 [Simple Interest and Temperature]
package deepak.deepakkankhar;

public class Assignment6 {
	
	void getSimpleInterest(double p, int t, double r) {
		
		double si=(p*r*t)/100;
		System.out.println("Simple Interest is: "+si);
	}
	
	void temperatureConverion(float fahrenheit) {
		float celsius=(fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius is: "+celsius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6 obj=new Assignment6();
		obj.getSimpleInterest(10000, 12, 7.9);
		obj.temperatureConverion(100);
	}
}
