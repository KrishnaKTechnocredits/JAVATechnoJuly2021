package astha.Assignment6;

public class Assignment6 {

	void simpleInterest (double principal, int time, double rate){
		double interest = (principal*time*rate)/100;
		System.out.println("The simple interest is "+interest);
	}
	
	void tempConversion (double F){
		double celsius = (F-32)*5/9;
		System.out.println("The celsius conversion is "+celsius);
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(10000.95,20,7.5);
		assignment6.tempConversion(104);
	}
	
}
