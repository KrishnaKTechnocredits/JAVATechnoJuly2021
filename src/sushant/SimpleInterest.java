/*Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9 */
package sushant;
		
class SimpleInterest{
	
	void simpleInterest1(int P, int T, double R){
		double Interest = (P*T*R)/100;
	    System.out.println("Simple interest is "+Interest);
	}
	
	void fehrenheitToCelsius(int fahrenheit) {
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius= "+Celsius);
	}
	
	public static void main(String[] args){
	    SimpleInterest sI1 = new SimpleInterest();
	    sI1.simpleInterest1(100, 8, 7.2);
	    sI1.fehrenheitToCelsius(60);
	}
}
		
