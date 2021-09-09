
		/*program 3 : given number is pallindrome or not, without converting it input into String?
                      int num = 12321;
                      ans : true */

package somnath;
import java.util.Scanner;
public class Assignment29_3 {

	boolean ispalindromNumber(int num)
	{
		int i=0;
		int rev=0;
		int temp=num;
		String length=String.valueOf(num);
		int length1=length.length();	
		while(num!=0)
		{
			rev+=(num%10)*Math.pow(10,length1-i-1);
			num=num/10;
			i++;
		}
		System.out.println("rev = "+rev);
		if(rev==temp)
			return true;
		else
			return false;
	}

	void displayPalindromNumber(int n)
	{
		if(ispalindromNumber(n))
			System.out.println(n+"No is Palindrom");
		else
			System.out.println(n+" No is Not Palindrom");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input Number ");
		int input1=sc.nextInt();
		new Assignment29_3().displayPalindromNumber(input1);
		System.out.println("Enter input Number ");
		int input2=sc.nextInt();
		new Assignment29_3().displayPalindromNumber(input2);
		sc.close();
	}

}