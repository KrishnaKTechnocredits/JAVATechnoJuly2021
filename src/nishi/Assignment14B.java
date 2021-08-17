package nishi;

public class Assignment14B {

	int findMinNumber(int[] a)
	{
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]<a[i])
					min=a[j];				
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Assignment14B assignment14b = new Assignment14B();
		int[] a= {1,11,44,23,55,99,23};
		System.out.println("Minimum number of given array is : "+assignment14b.findMinNumber(a));
	}
}
