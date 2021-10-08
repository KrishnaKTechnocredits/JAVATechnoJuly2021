/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/
package indu.Assignment_46;

import java.util.ArrayList;

public class First10PrimeNUmber_7 {

	ArrayList<Integer> findPrimeNumberRange(int startIndex,int endIndex)
	{
		int count=0;
		ArrayList<Integer> output = new ArrayList<Integer>();
			for(int index=startIndex;index<=endIndex;index++)
			{
				if(isPrime(index) && count<10)
				{
					output.add(index);
					count++;
				}
			}
		return output;
	}
	
	boolean  isPrime(int num)
	{
		boolean flag = false;
		for (int index = 2; index <num; index++) 
		{
			if (num % index == 0) {
				flag = false;
				break;
				}
				else
				{
					flag=true;
				}				
			}
			return flag;
	}
	
	public static void main(String[] args) {
		First10PrimeNUmber_7 a46_7 = new First10PrimeNUmber_7();
		int num1 = 100;
		int num2 =500;
		System.out.println("First 10 Prime number from range "+num1+" And "+ num2 +" is :\n"+a46_7.findPrimeNumberRange(100, 500));
	}
	
}
