package ankita;

public class Demo {
	void Even(int startindex,int endindex)
	{
	for (int startrange=startindex;startrange<=endindex;startrange++)
		{
			if(startrange%2==0)
			System.out.println("even no is "+startrange);	
		}
			System.out.println("------------------------------------");
	}
	void Diviby(int startindex,int endindex)
	{
		for (int startrange=startindex;startrange<=endindex;startrange++)
		{
			if(startrange%5==0)
			System.out.println("no is divisible by 5 is "+startrange);	
		}	
			System.out.println("------------------------------------");
	}
	void Diviby2no(int startindex,int endindex)
	{
		for (int startrange=startindex;startrange<=endindex;startrange++)
		{
			if(startrange%3==0 && startrange%5==0)
			System.out.println("no is divisible by 3 & 5 is "+ startrange);	
		}	
			System.out.println("------------------------------------");
	}
	void Divideby2no(int startindex,int endindex)
	{
		for (int startrange=startindex;startrange<=endindex;startrange++)
		{
			if(startrange%7==0)
			System.out.println(startrange +" is divisible by 7" );	
		else if (startrange%13==0)
			System.out.println(startrange +" is divisible by 13" );
		}	
			System.out.println("------------------------------------");
	}
	void sum(int startindex,int endindex)
	{
		int s=0;
	for (int startrange=startindex;startrange<=endindex;startrange++)
		{
			s=s+startrange;
		}
			System.out.println("Sum is "+s);	
		
			System.out.println("------------------------------------");
	}
	
	
	
	
	
	
	
	
	void sumevenodd(int startindex,int endindex)
	{
		int oddsum=0;
		int evensum=0;
	for (int startrange=startindex;startrange<=endindex;startrange++)
		{
			if(startrange%2==0)
				evensum=evensum+startrange;
			else if (startrange%2!=0)
				oddsum=oddsum+startrange;
		}  
			System.out.println("odd sum is "+oddsum);
			System.out.println(" Even sum is "+evensum);
		int result=evensum-oddsum;
			System.out.println(" Final result is  "+result);
			System.out.println("------------------------------------");
	}
	
	void oddrev(int startindex,int endindex)
	{
	for (int startrange=endindex;startrange>=startindex;startrange--)
		{
			if(startrange%2!=0)
			{
			System.out.println("odd no is "+ startrange);
				
			}
		}
			System.out.println("------------------------------------");
	}
	public static void main(String[] args){
		Demo demo1=new Demo();
		demo1.Even(10,15);
		demo1.Diviby(10,30);
		demo1.Diviby2no(5,18);
		demo1.Divideby2no(5,40);
		demo1.sum(1,5);
		demo1.oddrev(10,20);
		demo1.sumevenodd(3,9);
		
		
		}
}
