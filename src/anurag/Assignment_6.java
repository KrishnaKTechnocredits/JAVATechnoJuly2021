package anurag;

    class Assignment_6 {
	
	static double simpleInterest;
	int PrincipleAmount;
	int Time;
	int Rate;
	
	void simpleInterest(int P,int T, float R)
	{
		simpleInterest = (P*T*R)/100;
		System.out.println("simple interest: "+simpleInterest);
		
	}
	void convertTemperature(int fahrenheit)
	{
		double Celsius = (fahrenheit  - 32)* 5/9;
		System.out.println("Convert Temperature from fahrenheit to Celsius: "+Celsius);
	}
	
	public static void main(String[]argss)
	{
		 Assignment_6 assignment = new Assignment_6();
		 int PrincipleAmount = 1000;
		 int Time = 2;
		 float Rate = 7.5f;
		 int fahrenheit = 100;
		 assignment.simpleInterest(PrincipleAmount, Time, Rate);
		 assignment.convertTemperature(fahrenheit);
	}

}
