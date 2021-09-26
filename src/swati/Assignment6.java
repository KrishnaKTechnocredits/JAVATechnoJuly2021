package swati;

class Assignment6{
	 int simpleInterest;
	 double celsius;
	void interest(int principle,int time,int rate){
		
		simpleInterest=(principle*time*rate)/100;
		System.out.print("Simple Interest:" + simpleInterest +'\n');
	}
	
	void convertTemp(int fahrenheit ){
		
		celsius=((fahrenheit - 32) * 5) / 9;
		System.out.print("Temperature from Fahrenheit to Celsius degree: " + celsius +"C");
	}
	
	public static void main(String[] a){
		Assignment6 assignment6 = new Assignment6();
		assignment6.interest(200000,15,2);
		assignment6.convertTemp(212);
		
	}
}
		
		
		