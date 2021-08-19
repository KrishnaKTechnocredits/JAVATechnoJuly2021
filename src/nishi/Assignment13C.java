package nishi;

public class Assignment13C {
	
	int[] fiveSmallerNumber(int number)
	{
		int[] a= new int[5];
		for(int i=0;i<5;i++)
		{
			number--;
			a[i]=number;
		}
		return a;
	}

	public static void main(String[] args) {
		Assignment13C assignment13c= new Assignment13C();
		System.out.println("Five smaller number are :");
		int[] a = assignment13c.fiveSmallerNumber(50);
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}		
	}

}
