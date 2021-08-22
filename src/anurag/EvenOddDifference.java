package anurag;

public class EvenOddDifference {
	int maxOddEven(int [] evenOdd)
	{
		int even=0;
		int odd=0;
		for(int index =0;index<evenOdd.length;index++)
		{
			 if(evenOdd[index]%2==0 && evenOdd[index]>even)
        	 {
        		 even=evenOdd[index];
        	 }
			 else if(evenOdd[index]%2!=0 && evenOdd[index]>even)
			 {
				 odd=evenOdd[index];
			 }
		}
		int difference=even-odd;
		return difference;
	}
	public static void main(String[]args)
	{
		EvenOddDifference evenOdd=new EvenOddDifference();
		int [] inputEvenOdd= {1,11,44,23,55,99,23};
		System.out.println("Difference max Odd even number of given array "+ evenOdd.maxOddEven(inputEvenOdd));
	}
}
