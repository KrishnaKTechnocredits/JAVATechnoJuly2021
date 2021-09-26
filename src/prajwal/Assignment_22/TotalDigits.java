/**
 * 
 */
/**
 * @author User
 *
 */
package prajwal.Assignment_22;

public class TotalDigits {
	
	String str= "Te1ch2no3cr4ed3it4s";
	static int count=0;
	
	void totalDigits() {
	for(int i=0;i<str.length();i++)
	{
		char ch= str.charAt(i);
		if(Character.isDigit(ch))
		count ++ ;
	}
	}
	
	public static void main (String[] args) 
	{
		TotalDigits totaldigits = new TotalDigits ();
		totaldigits.totalDigits();
		System.out.println("Total Digits in given String is " + count);
	}
}
