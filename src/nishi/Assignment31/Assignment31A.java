package nishi.Assignment31;

public class Assignment31A {
	
	int getCountOfThreeConsecutive(int a[])
	{
		int count=0;
		int conscnt=0;
		//int i=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]+1==a[i+1] )
			{
				count++;
				if(count==2)
				{
					conscnt++;
					count=0;
				}
			}
		}
			
		return conscnt;
	}
	
	public static void main(String[] args) {
		int[] a= {10,23,24,25,26,61,62,64,65,66};
		System.out.println("Count is "+new Assignment31A().getCountOfThreeConsecutive(a));
	}

}
