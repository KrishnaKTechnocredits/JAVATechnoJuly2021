package nishi.Assignment46;

import java.util.ArrayList;

public class Example7 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new Example7().getPrimeNumbers(100,500);
		System.out.println(al);
	}

	boolean isPrime(int num)
	{
		boolean flag=false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			else
			{
				flag=true;
			}				
		}
		return flag;
	}
	private ArrayList<Integer> getPrimeNumbers(int startIndex, int lastIndex) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int count=0;
		for(int index=startIndex;index<=lastIndex;index++)
		{
			if(isPrime(index) && count<10)
			{
				al.add(index);
				count++;
			}
		}
		return al;		
	}

}
