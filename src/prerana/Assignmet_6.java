package prerana;

public class Assignmet_6 {
	int p;
	int t;
	int r;
	int sp_amt;
	float f, celsius;
	
	
	void sp(int p,int t,int r ) {
		System.out.println("Principal amount is: "+p );
		System.out.println("Time period is: "+t );
		System.out.println("rate of intrest  is: "+r );
		
		sp_amt=(p*t*r)/100;
		System.out.println("Simple intrest amount is: "+sp_amt );
		
	}
	void cp(int f) {
		System.out.println("Fahrenheit temprature is: "+f );
		
		celsius=((f-32)*5)/9;
		System.out.println("conversion of temprature from  Fahrenheit to celsius is: "+celsius );
		
		
	}
	
	public static void main(String[] a) {
		Assignmet_6 a1=new Assignmet_6();
		a1.sp(1000, 2, 50);
		a1.cp(50);
		
	}

}
