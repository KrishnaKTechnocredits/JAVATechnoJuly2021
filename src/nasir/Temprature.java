package nasir;

class Temprature
{


	void celciusToFahrinite(int fahrinite)
	{

		double celcius=(fahrinite-32)*5/9;
		System.out.println("celcius is equal to :" + celcius );
	}

	public static void main(String[] args)
	{
		Temprature temprature= new Temprature();
		temprature.celciusToFahrinite(60);


	}

}