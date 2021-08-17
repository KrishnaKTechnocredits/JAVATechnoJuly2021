package nishi;

public class Assignment14A {
	
	int findMaxNumber(int[] a)
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
					max=a[j];				
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Assignment14A assignment14a = new Assignment14A();
		int[] a= {1,11,44,23,55,99,23};
		System.out.println("Maximum number of given array is :"+assignment14a.findMaxNumber(a));
				
	}

}
