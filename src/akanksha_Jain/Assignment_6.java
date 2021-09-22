/* Assignment - 6 .: 7th Aug-2021 .
Create two parameterized methods in same class.
Write a method to compute simple interest  
           	Simple Interest = (P x T x R)/100
           	Where,
                          	P is the principle amount
                          	T is the time [year] and
                          	R is the rate
 Write a method to convert temperature from Fahrenheit to Celsius degree.
           	 Celsius = (fahrenheit - 32) * 5 / 9
*/

package akanksha_Jain;

public class Assignment_6 {
	
	void calculateSimpleInterest(int P, int T, float R) {
		float simpleinterest = (P * T * R)/100;
		System.out.println("Simple Interest= " + simpleinterest);
	}
	
	void convertTemperature(float farhenheit) {
		float celsius = (farhenheit - 32) * 5 / 9;
		System.out.println("Temperature from Farhenheit to Celsuis degree= " + celsius);
	}
	
	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.calculateSimpleInterest(60, 3, (float)10.5);
		assignment_6.convertTemperature(85);
	}
}