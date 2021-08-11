package shantanu;

class Assignment6{
	float simpleInterest;
	float celcius;
	
	void calculateSimpleInterest(float principalAmount, int years, float rate){
		simpleInterest = (principalAmount*years*rate)/100;
	}
	
	void convertFahrenheitToCelcius(float temp){
		celcius = (temp - 32)*5/9;
	}
	
	public static void main(String args[]){
		Assignment6 assignment6 = new Assignment6();
		assignment6.calculateSimpleInterest(10000.00f, 4, 3.5f);
		System.out.println("Simple Interest is: "+ assignment6.simpleInterest);
		assignment6.convertFahrenheitToCelcius(80.5f);
		System.out.println("Temperature in celcius: "+ assignment6.celcius);
	}
}