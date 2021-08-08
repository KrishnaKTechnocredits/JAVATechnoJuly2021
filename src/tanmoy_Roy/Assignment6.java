
//Write a method to compute simple interest
//Write a method to convert temperature from Fahrenheit to Celsius degree.
//Raise PR

package tanmoy_Roy;

public class Assignment6 {

	void simpleInterest(double Principle, double Rate ,double Time) {
		System.out.println("Principle(Rs.) : "+Principle+"\nRate(percent) : "+Rate+"\nTime(yrs) : "+Time);
		System.out.println("Simple Interest : "+(Principle*Rate*Time)/100.00);
	}
	
	void TempConvert(double Fahrenheit) {
		System.out.println("Temperature in Fahrenheit :"+Fahrenheit);
		System.out.println("Temperature in Celcius :"+ (((Fahrenheit - 32) * 5) / 9));
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(1000, 8, 2.2);
		assignment6.TempConvert(-40);
	}
}
