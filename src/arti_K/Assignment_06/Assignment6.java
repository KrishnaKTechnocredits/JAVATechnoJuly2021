/* *Assignment - 6 .: 7th Aug-2021 *.

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9      */

package arti_K.Assignment_06;

public class Assignment6 {
	double sI;
	int celcius;
	
	void simpleInterest(int principle, int time, double rate) {
		
		sI = (principle*time*rate)/100;
		System.out.println("Simple Interest is : "+sI);
	}
	
	void temperature(int fahrenheit) {
		celcius = (fahrenheit - 32)*5/9;
		System.out.println("Temperature in Celecius degree is : "+celcius);
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(5000,3,5.21);
		assignment6.temperature(80);
	}
}
