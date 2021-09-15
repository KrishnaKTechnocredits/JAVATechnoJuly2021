	/*  program 2: String Pallindrome by without writing reverse method logic.
				   String input = "naman";
                   String input = "aabbaa";
                   String input = "malayalam";*/

package somnath;
import java.util.Scanner;
public class Assignment29_2 {

	boolean getPalindromWithoutReverse(String s)
	{		
		int mid=s.length()/2;
		int i=0;
		boolean flag=false;
		while(i<mid)
		{
			if(s.charAt(i)==s.charAt(s.length()-i-1))
			{
				flag=true;
				i++;
			}
			else
			{
				flag=false;
				break;
			}			
		}
		return flag;		
	}	

	void displayPalindromOrNot(String s)
	{
		boolean flag=getPalindromWithoutReverse(s);
		if(flag)
			System.out.println(s+" String is Palindrom");
		else
			System.out.println(s+" String is Not Palindrom");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String ");
		String input1=sc.next();
		new Assignment29_2().displayPalindromOrNot(input1);
		System.out.println("Enter input String ");
		String input2=sc.next();
		new Assignment29_2().displayPalindromOrNot(input2);
		sc.close();
	}
	}
