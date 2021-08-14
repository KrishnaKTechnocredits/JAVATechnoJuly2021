package poojaJoshi;

public class Assignment_6 {
	
	int P;
	int T;
	double R;
	
	void cacculateSimpleinterest(int P, int T, double R) {
		float simpleinterest1;
		simpleinterest1=(float) ((P*T*R)/100);
		System.out.println("Simple interest is " +simpleinterest1);
		}
	
	void convertTemperature(float fahrenheit){
		float Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature is " +Celsius);
		
	}
	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.convertTemperature(98);
		assignment_6.cacculateSimpleinterest(10, 20, 30.6);
	}

}
