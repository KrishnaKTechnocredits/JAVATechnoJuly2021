package shyam;

public class Assignment_6 {
	void simpleInterest (int P,int T,int R) {
		int SI=(P*T*R)/100;
		System.out.println(SI);
	}
	
	void temperature(int fahrenheit){
		int Celcius=(fahrenheit-32)*5/9;
		System.out.println(Celcius);
	}
	
	public static void main(String[] a) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(1000, 10, 9);
		assignment_6.temperature(104);
	}
}
