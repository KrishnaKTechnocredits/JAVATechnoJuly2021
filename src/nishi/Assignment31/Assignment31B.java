package nishi.Assignment31;

public class Assignment31B {	
	
	void getPerfectNumber(int startIndex,int endIndex)
	{		
		
		for(int j=startIndex;j<=endIndex;j++)
		{
			int sum=0;
			for(int i=1;i<j;i++)
			{		
				if(j%i==0)
				{
					sum+=i;
				}
			}
			if(sum==j)
				System.out.println(j+" is perfect number");				
		}			
	}
	
	public static void main(String[] args) {
		new Assignment31B().getPerfectNumber(1,8128);
	}

}
