

/*program 3 : given number is pallindrome or not, without converting it input into String?
int num = 12321;
ans : true
Hint : % and /*/
package santosh;
import java.util.Scanner;
public class NumberPalindrome_29 {

	boolean numPalindrome(int num) {

		int reverseNum = 0;
		int input = num;
		while (num > 0) {
			int temp = num % 10;
			reverseNum = (reverseNum * 10) + temp;
			num = num / 10;
		}
		if (input == reverseNum)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check palindrome : ");
		int num=sc.nextInt();
		NumberPalindrome_29 numPalindrome = new NumberPalindrome_29();
		boolean flag = numPalindrome.numPalindrome(num);

		if (flag)
			System.out.println(num + " is palindrome");
		else
			System.out.println(num + " not a palindrome");
	}

}
 

