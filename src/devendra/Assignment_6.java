package devendra;

public class Assignment_6 {
	double p,r,f;		//Principle Amount,Rate Of Interest,Temp. in Fahrenheit
	int t;				//Time Period

	void computeSI() {
		p = 5050.50 ;
		t = 365 ;
		r = 18.50 ;
		System.out.print("Principle = "+p);
		System.out.print(", Rate of Interest = "+r);
		System.out.println(", Time Period = "+t);
	}
	
	void convertTemp_FtoC(){
		f = 105 ;
		System.out.print("Temperature in Fahrenheit = "+f);
		System.out.println("°F");
	}
	
	void display () {
		System.out.println("----------------------");
		double si = (p*t*r)/100 ;				//Simple Interest
		System.out.println("Simple Interest is = "+si) ;
		double celsious = (f - 32) * 5/9 ;		//Temp. in Degree Celsious
		System.out.print("Temperature in Celsious = "+celsious) ;
		System.out.println("°C");
	} 
	
	public static void main ( String [ ] a ) { 
		Assignment_6 a6 = new Assignment_6() ; 
		a6.computeSI(); 
		a6.convertTemp_FtoC();
		a6.display() ; 	
	}
}