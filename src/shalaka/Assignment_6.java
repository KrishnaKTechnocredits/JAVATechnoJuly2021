package shalaka;

public class Assignment_6{
	void simpleInterest(int p, int r,int t){
		int simpleInterest= (p*r*t)/100;
		System.out.println("Simple interest is "+simpleInterest);
	}
	void convertTemperature(int fahrenheit){
		int celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature from fahrenheit to celsius is "+celsius);
	}
	public static void main(String [] args){
	Assignment_6 assignment_6 = new Assignment_6();
	assignment_6.simpleInterest( 500,12,5);
	assignment_6.convertTemperature(25);
	}
	
}