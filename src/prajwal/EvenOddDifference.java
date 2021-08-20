package prajwal;

public class EvenOddDifference {
	int sum=0;
	int sum2=0;
	int sum3=0;
	int differenceBetnSumOfEvenOddNo(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		if(arr[i]%2==0)
		{
			sum=sum+arr[i];
		}
		else
		{
			sum2=sum2+arr[i];
		}
		if(sum >=sum2)
		{
			sum3=sum-sum2;
		}
		else
		{
			sum3=sum2-sum;
		}
		return sum3;
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
    EvenOddDifference evenodddifference= new EvenOddDifference();
    int [] arr= {13,22,10,3};
    System.out.println("differnce betn sum of  even numbers & sum of odd numbers :" +evenodddifference.differenceBetnSumOfEvenOddNo(arr));
}

}
