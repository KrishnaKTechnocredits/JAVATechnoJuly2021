package shraddha.BasicExamples;

class Converter{
	public static void main(String[] args){
		Converter cv = new Converter();
		cv.simpleInterest(25000,5,3);
		cv.temperatureConverter(98);
	}
	
	void simpleInterest(int principle,int time,int rate){
		double si;
		si = (principle*time*rate)/100;
		System.out.println("Simple Interest is "+si);
	}
	
	void temperatureConverter(double farenheit){
		double celcius;
		celcius = (farenheit-32)*5/9;
		System.out.println("Temperature in Celcius is "+celcius);
	}
}