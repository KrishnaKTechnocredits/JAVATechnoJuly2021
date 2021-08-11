package vivek;

public class Assignment6 {
	double interest;
	double temp;
	
	void simpleInterest(int p,int t,double r) {
		interest=(p*t*r)/100;
	}
	
	void calculateTemp(double f) {
		temp=(f-32)*5/9;
	}
	
	void displayInfo() {
		System.out.println("Simple Interest computed is " + interest);
		System.out.println("Temperature in degree celsius is " + temp);
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.simpleInterest(1000,2,10.2);
		assignment6.calculateTemp(97.7);
		assignment6.displayInfo();
	}
}
