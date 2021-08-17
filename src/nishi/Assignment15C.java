package nishi;

public class Assignment15C {
	
	int differenceOfSumOfEvenAndOdd(int[] a)
	{
		int sumOfEven=0;
		int sumOfOdd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				sumOfEven+=a[i];
			else
				sumOfOdd+=a[i];
		}
		if(sumOfEven>sumOfOdd)
			return sumOfEven-sumOfOdd;
		else
			return sumOfOdd-sumOfEven;
	}
	
	public static void main(String[] args) {
		Assignment15C assignment15c=new Assignment15C();
		int[] a = {12,2,13,9};
		System.out.println("Difference between sum of Even no & odd no : "+assignment15c.differenceOfSumOfEvenAndOdd(a));
	}

}
