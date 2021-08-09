/*Assignment - 6 .: 7th Aug-2021

Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Raise PR for the same

*/

package mayur;
class Assignment6{
	
	void simpleInterest(int principleAmount, int time, int rate){
		double sp;
		sp = (principleAmount*time*rate)/100;
		System.out.println("Simple Interest is :"+sp);
	}
	void temperature(int fahrenheit){
		double Celsius;
		Celsius = (fahrenheit-32)*5/9;
		System.out.println("Temperature is :"+Celsius);
	}
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(1000,12,6);
		assignment6.temperature(100);
	}
}