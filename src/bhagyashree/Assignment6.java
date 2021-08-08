package bhagyashree;

public class Assignment6 {

	    void computeSimpleInterest(double principleAmt,double year,double rate)
		{
			double interest=(principleAmt*year*rate)/100;
			System.out.println("Simple Interest  "+interest);
		}
		
		void convertTemptoFahrenheit(double fahrenheit)
		{
			double Celcius;
		    Celcius = (fahrenheit - 32) * 5 / 9;
		    System.out.println("Conversion of Fehrenhight to Celcius   "+Celcius);
		}
	
		public static void main(String[] args)
		{
			Assignment6 assignment6=new Assignment6();
			assignment6.computeSimpleInterest(5000000,30,9.5);
			
			assignment6.convertTemptoFahrenheit(30);
		}
	

}
