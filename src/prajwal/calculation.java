package prajwal;

public class calculation{
	void simpleInterest1(int P, int T, int R) {
		int simpleInterest1;
		simpleInterest1= (P*T*R)/100 ;
		System.out.println("Simple Interest Amount is "+simpleInterest1);
	}
		
	void temperature(double fahrenheit){
		double celsius;
		celsius = (fahrenheit-32)*5/9;
		System.out.println("TEmperature in Celsius is "+celsius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation simpleInterest1= new calculation();
		simpleInterest1.simpleInterest1(20,30,40);
		simpleInterest1.temperature(78.70);

	}

}
