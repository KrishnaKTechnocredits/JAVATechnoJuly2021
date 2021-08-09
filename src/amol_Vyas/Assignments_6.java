package amol_Vyas;

public class Assignments_6 {

	void simpleInterset(float principle, float rate, float time) {
		float simpleInterset;
		simpleInterset = (principle * rate * time) / 100;
		System.out.println("Simple Interset is " + simpleInterset);
	}
	
	void changeTempCelsius (float fahrenheit ) {
		float celsius  = (fahrenheit  - 32)* 5/9;
		System.out.println("Converted temperature in celsius is  " + celsius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignments_6 assignments_6 = new Assignments_6();
		assignments_6.simpleInterset(10000.0f, 6.5f, 2f);
		assignments_6.changeTempCelsius(98.4f);
		
		
		
		
	}

}
