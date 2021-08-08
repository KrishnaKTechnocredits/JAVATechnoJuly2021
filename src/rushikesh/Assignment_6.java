package rushikesh;

public class Assignment_6 {
	void simpleInterest(int principle,double time,double rate){
		double simpleInterest= (principle*time*rate)/100;
		System.out.println("Simple Interest is "+simpleInterest);
	}
	void convertTemp(float fahrenheit){
		float celsius= (fahrenheit-32)*5/9;
		System.out.println("Temperature in celcius is "+celsius);
	}
	public static void main(String[] args) {
		Assignment_6 assignment_6=new Assignment_6();
		assignment_6.simpleInterest(10000, 5 , 8.5 );
		assignment_6.convertTemp(80);
	}
}
