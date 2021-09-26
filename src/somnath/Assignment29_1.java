	/*Program 1 : String Pallindrome by writing reverse method logic.
				  String input = "naman"; */

package somnath;
import java.util.Scanner;
public class Assignment29_1 {

	String getPalindromUsingReverse(String s)
	{
		String output="";
		for(int i=s.length()-1;i>=0;i--)
		{
			output+=s.charAt(i);
		}		
		if(s.equals(output))
		{
			return s+" No. is Palindrom";
		}
		else
		{
			return s+" No. is Not Palindrom";
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String ");
		String input1=sc.next();
		System.out.println(new Assignment29_1().getPalindromUsingReverse(input1));
		System.out.println("Enter input String ");
		String input2=sc.next();
		System.out.println(new Assignment29_1().getPalindromUsingReverse(input2));
		sc.close();
	}

}
 


 


