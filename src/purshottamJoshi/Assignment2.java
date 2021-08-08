package purshottamJoshi;

public class Assignment2{
	int simpleInterest;
	int Celsius;
	void calculateSimpleInterest(int p,int t,int r){
		simpleInterest = (p*t*r)/100;
		System.out.println("Simple Interest " +simpleInterest);
	}
	void convertTemperature(int faherenhit){
		Celsius = (faherenhit -32)*5/9;
		System.out.println("Converted Temperature " +Celsius);
	}
	public static void main(String[] args){
		Assignment2 assignment2 = new Assignment2();
		assignment2.calculateSimpleInterest(10000,1,16);
		assignment2.convertTemperature(87);
	}
	
}