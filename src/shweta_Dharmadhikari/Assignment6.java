package shweta_Dharmadhikari;

public class Assignment6{

	void calculateSimpleInterest(int p, int t, int r){
		int simpleInterest = (p*t*r)/100;
		System.out.println("Simple interest :" +simpleInterest);
	}
	
	void convertTemperature(int faherenhite){
		int celsius = (faherenhite - 32) * 5/9;
		System.out.println("Temperature :" +celsius);
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.calculateSimpleInterest(50000,3,15);
		assignment6.convertTemperature(40);
	}	
}