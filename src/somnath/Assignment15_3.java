package somnath;
public class Assignment15_3 {

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
		Assignment15_3 assignment15_3=new Assignment15_3();
		int[] a = {12,2,13,9};
		System.out.println("--------------------------------------------------");
		System.out.println("Difference between sum of Even no & odd no : "+assignment15_3.differenceOfSumOfEvenAndOdd(a));
	    System.out.println("-----------------------------------------------------");
	}

}