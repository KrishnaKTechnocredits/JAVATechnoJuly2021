package harshada;

public class Assignment_6 {
	
	void calculate_SI(float pri, int year, float roi) {
		float si;
		si=(pri*year*roi)/100;
		System.out.println("Simple Interest="+ si);
	}
	
	void convertTemparature(float farenhite) {
		float celsius;
		celsius = ( (farenhite - 32) * 5) / 9;
		System.out.println("Celcius = "+ celsius);
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6=new Assignment_6();
		assignment_6.calculate_SI(2000f, 5,4.5f);
		assignment_6.convertTemparature(98f);
		
	}

}
