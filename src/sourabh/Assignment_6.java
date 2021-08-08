package sourabh;

public class Assignment_6 {
	
	void simpleInterest(float p, float t, float r) {
		float simpleInterest = (p*t*r)/100;
		System.out.println("Simple Interest value = " + simpleInterest);	
	}
	
	void convertTempFahreniteToCelcius(float f) {
		float celcius = (f - 32) * 5 / 9;
		System.out.println("Temp = " + celcius + "Celcius");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(10.3f, 4.2f, 57.1f);
		assignment_6.convertTempFahreniteToCelcius(78.8f);

	}

}
