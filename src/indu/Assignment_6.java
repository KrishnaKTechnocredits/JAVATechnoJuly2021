
package indu;

public class Assignment_6 
{
	void calculateSimpleIntrest(double principleAmount , double time , double rate)
	{
		double simpleIntrest = (principleAmount * time * rate)/100;

		System.out.println("------------Program to calculate Simple Intrest-----------");
		System.out.println("Principle Amount : " + principleAmount);
		System.out.println("Time : " + time);
		System.out.println("Rate : " + rate);
		System.out.println("Simple Intrest : " + simpleIntrest);
	}

	void convertTemp(double fahrenheit)
	{
		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("------------Program to Convert Temperature from Celsius to Fahrenheit-----------");
		System.out.println("Temperature in Fahrenheit : " +fahrenheit);
		System.out.println("Temperature in Celsius : " + celsius);
	}

	public static void main(String[] args)
	{

		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.calculateSimpleIntrest(20000, 11, 12.5);
		assignment_6.convertTemp(199);
	}
}