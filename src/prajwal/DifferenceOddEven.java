package prajwal;

public class DifferenceOddEven {
	
	int differenceoddeven(int[] arr)
	{   int diff=0;
		int Max=0;
		int Max2=0;
		for(int i=0; i<arr.length-1; i++)
	{ 
		if(arr[i] % 2==0)
		{
		if(arr[i]>Max)
			Max=arr[i];
		}
		else
		{
			if(arr[i]>Max2)
				Max2=arr[i];
		}
			
	}	
		return diff= Max2-Max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceOddEven differenceoddeven = new DifferenceOddEven();
		int[] arr= {1,11,44,23,55,99,23,22};
		System.out.println("difference between odd & even number is" +differenceoddeven.differenceoddeven(arr));
	
	}

}
