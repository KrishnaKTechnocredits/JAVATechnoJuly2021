package bhakti;

public class Assignment7 {
	
	void simpleInterest(float p, int t, float r) {
		float smpInt= (p*t*r)/100;
		System.out.println("Simple insterset: "+smpInt );
	}
	
	void temToFah(float f) {
		float celsius;
		celsius = (f - 32) * 5 / 9;
		System.out.println("========================================");
		System.out.println("Temperature is "+celsius+" Celsius degree");
		
	}
	 
	public static void main(String[] df) {
		Assignment7 assignment7= new Assignment7();
		assignment7.simpleInterest(3444.78f, 2016, 23.45f);
		assignment7.temToFah(34.56f);
		
	}

}
