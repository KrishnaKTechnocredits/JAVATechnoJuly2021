/**
 * 
 */
/**
 * @author User
 *
 */
package prajwal.Assignment_22;

public class SumOfDigits {
	
	String str= "Te11ch2no3cr4ed2ts";
	static int sum=0;
	
	void totalDigits() {
	for(int i=0;i<str.length();i++)
	{
		char ch= str.charAt(i);
		if(Character.isDigit(ch))
		{
			sum= sum+ Character.getNumericValue(ch);
		}
	}
	}
	
	public static void main (String[] args) 
	{
		SumOfDigits totaldigits = new SumOfDigits ();
		totaldigits.totalDigits();
		System.out.println("Sum of Total Digits in given String is " + sum);
	}
}
