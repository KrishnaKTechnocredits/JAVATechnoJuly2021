package sayali_V;

public class Assignment_6 
{
	void computeSimpleInterest(int p,int t,int r)
	{
		int simpleinterest;
		simpleinterest=(p*t*r)/100;
		System.out.println("Simple Interest is: " +simpleinterest);
	}
		
	void fahrenheitToCelsius(int f)
	{
		int celsius;
		celsius=(f-32)*5/9;
		System.out.println("value of celsius is:" +celsius);
	}
		
	public static void main(String[] args)
	{
		Assignment_6 Assignment =new Assignment_6();
		Assignment.computeSimpleInterest(10,5,2);
		Assignment.fahrenheitToCelsius(60);
	}
}



