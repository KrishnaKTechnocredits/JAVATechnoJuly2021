package nishi;

public class Assignment13B {
	
	int countNumberOfZeros(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment13B assignment13b= new Assignment13B();
		int[] arr = {1,-11,0,0,55,0,-23,0};
		System.out.println("Count of zeros "+assignment13b.countNumberOfZeros(arr));
	}

}
