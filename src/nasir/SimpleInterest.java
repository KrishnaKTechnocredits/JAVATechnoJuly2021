package nasir;

class SimpleInterest
{
	int si;
	void sInterest(int P,int R, int T)
	{
		si= (P*R*T)/100;
	}
	void calc()
	{
		System.out.println("Simple interest =" + si);
	}
	public static void main(String[] args)
	{
		SimpleInterest simpleInterest =new SimpleInterest();
		simpleInterest.sInterest(4,5,6);
		simpleInterest.calc();		
		
	}
}	  
	  