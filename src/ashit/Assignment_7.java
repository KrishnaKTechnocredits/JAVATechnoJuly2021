package ashit;
class Assignment_7{
	
	void simpleInterest(int p,int t, int r){
		int si= (p*r*t)/100;
		 System.out.println("Simple interest is "+si);
		 // where P=principle amount, T= time(year), R is the rate of interest
		}
	
	void fahToCelsius (int fahrenheit){
		int Celsius=(fahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius is " +Celsius);
	}

	public static void main (String[] args){
		Assignment_7 assignment_7= new Assignment_7();
		assignment_7.simpleInterest(100000,2,4);
		assignment_7.fahToCelsius(275);
	}	
}
