package margi;

class Assignment_6{
	
	void simple_Interest(int principleAmount, int time, int rate){
		float interest = (principleAmount * time * rate)/100f;
		System.out.println("Simple Interest is: " + interest);
	}
	
	void temperature(int fahrenheit){
		float celsius = (fahrenheit - 32) * 5/9f;
		System.out.println("Celsius is: " + celsius);
	}
	
	public static void main(String[] args){
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simple_Interest(2354,235,3);
		assignment_6.temperature(85);
	}
}