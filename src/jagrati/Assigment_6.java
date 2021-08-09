package jagrati;

public class Assigment_6{
	void simpleInteres( float p, float T, float R){
		float simpleInteres = (p*T*R)/100;
		System.out.println("simpleInteres value is " + simpleInteres);
	}
	void convertTemperature(float fahrenheit){
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("celsius "+celsius);
		
	}
	public static void main(String []aa){
		Assigment_6 assigment_6 = new Assigment_6();
		assigment_6.simpleInteres(12.2f, 1.5f, 250.25f);
		assigment_6.convertTemperature(96.7f);
		
		
	}
		
	


}