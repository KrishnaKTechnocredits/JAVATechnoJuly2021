package nasir;

class SimpleInterest
{


	void calulation(int P,int R, double T)
	{

		double interest= (P*R*T)/100;
		System.out.println("Simple interest =" + interest);
	}

	public static void main(String[] args)
	{
		SimpleInterest simpleInterest =new SimpleInterest();
		simpleInterest.calulation(7,10,2);

	}
}	  
