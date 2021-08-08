//Assignment - 6 .: 7th Aug-2021 .

//Create two parameterized methods in same class. 

//Write a method to compute simple interest   
	//Simple Interest = (P x T x R)/100 
	//Where, 
		//P is the principle amount 
		//T is the time [year] and 
		//R is the rate

 //Write a method to convert temperature from Fahrenheit to Celsius degree.
	 //Celsius = (fahrenheit - 32) * 5 / 9

//Raise PR for the same

package chaitanya;

public class ass6SITemp{
	
	void SI(int p, int t, float r) {
		float si;
		si = (p*t*r)/100;
		System.out.println("Simple Interest : " + si);
	}
	
	void Temp( float f) {
		float c ;
		c = ((f-32)*5)/9;
		System.out.println("Celsius : " + c);
	}
	
	public static void main(String[] args) {
		ass6SITemp ass6sitemp = new ass6SITemp();
		ass6sitemp.SI(2000000,20,8.5f);
		ass6sitemp.Temp(105f);
	}

}
