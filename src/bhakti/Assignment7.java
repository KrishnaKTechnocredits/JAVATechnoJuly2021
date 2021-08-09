package bhakti;

public class Assignment7 {
	
	void simpleInt(float p, int t, float r){
		float simInt=(p * t * r)/100;
		System.out.println ("Simple insterset is : "+simInt);
	}
	
	void celsius(float f){
		float celsius = (f - 32) * 5 / 9;
		System.out.println ("====================================");
		System.out.println ("Temperature is : "+celsius+ " Celsius degree");
	}
	
	public static void main(String [] rts) {
		Assignment7 assignment7= new Assignment7();
		assignment7.simpleInt( 34546.56f, 2019, 1.234f);
		assignment7.celsius(234.45f);
		
	}

}
