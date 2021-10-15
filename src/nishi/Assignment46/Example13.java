/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example13 {
	public static void main(String[] args) {
		Integer[] a= {19,12,18,17,23,22};
		ArrayList<Integer> al=new Example13().removeAllNonPrime(Arrays.asList(a));
		System.out.println("Output : "+al);
	}
	private ArrayList<Integer> removeAllNonPrime(List<Integer> al) {
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(Integer i:al)
		{
			if(isPrime(i))
				al2.add(i);				
		}
		return al2;
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
}
