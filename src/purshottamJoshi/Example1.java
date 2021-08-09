package purshottamJoshi;

class Example1
{
	int x=10;
	int y=20;
	
	void processdata()
	{
	x=50;
	y=100;
	}
	
	void sun(){
	System.out.println(x+y);
	
	}

public static void main(String[] args)

{
	Example1 exm= new Example1();
	exm.processdata();
	exm.sun();
}

}