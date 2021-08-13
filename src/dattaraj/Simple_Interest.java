package dattaraj;

public class Simple_Interest {
	
	void simple_Intrest(Double p_amt,int tensure,double rate) {
		double simple_interest;
		simple_interest = (p_amt*tensure*rate)/100;
		System.out.println("Your Simple Interset is: "+simple_interest);
	}
	
	void to_Celcius(double fahrenheit) {
		double celcius;
		celcius= (fahrenheit - 32) * 5 / 9;
		System.out.println(fahrenheit+" Fahrenheit is "+celcius+" Celcius.");
	}
	
	public static void main(String[] args){
		Simple_Interest simple = new Simple_Interest();
		simple.simple_Intrest(15000.00, 5, 5.5);
		simple.to_Celcius(105.10);
	}

}
