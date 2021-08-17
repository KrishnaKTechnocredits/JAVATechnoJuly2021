package nishi;

public class Assignment14D {

	int findDifferenceOfMaxOddAndEven(int[] a)
	{		
		int maxOdd=0;
		int maxEven=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					if(a[j]%2==0)
					{
						maxEven=a[j];
					}
					else
					{
						maxOdd=a[j];
					}
				}
			}
		}
		return maxOdd-maxEven;
	}

	public static void main(String[] args) {
		Assignment14D assignment14d = new Assignment14D();
		int[] a= {1,11,44,23,55,99,23};
		System.out.println("Maximum number odd & even difference is :"+assignment14d.findDifferenceOfMaxOddAndEven(a));
	}
}
