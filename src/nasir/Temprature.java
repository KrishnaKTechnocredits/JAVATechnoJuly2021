package nasir;

class Temprature
{
	int celcius;

	void celciusToFahrinite(int fahrinite)
	{
		celcius=(fahrinite-32)*5/9;
	}
	void displayResult()
	{
		System.out.println("celcius is equal to :" + celcius );
		
	}

	public static void main(String[] args)
	{
		Temprature temprature= new Temprature();
		temprature.celciusToFahrinite(60);
		temprature.displayResult();
		
  }

}