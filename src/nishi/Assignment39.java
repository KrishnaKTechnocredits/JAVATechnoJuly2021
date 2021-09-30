package nishi;

public class Assignment39 {
	
	void printFibonacciSeries(int number)
	{
		int n1=0;
		int n2=1;
		int res=n1+n2;
		System.out.print(n1+",");
		System.out.print(n2+",");
		for(int i=0;i<number-2;i++)
		{		
			System.out.print(res+",");
			n1=n2;
			n2=res;	
			res=n1+n2;
		}
	}
	
	public static void main(String[] args) {
		new Assignment39().printFibonacciSeries(8);
	}

}
