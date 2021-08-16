package nishi;

public class Assignment13A {
	
	int countPositiveNumbers(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment13A assignment13a= new Assignment13A();
		int[] arr = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Count of positive nos "+assignment13a.countPositiveNumbers(arr));
	}
}
