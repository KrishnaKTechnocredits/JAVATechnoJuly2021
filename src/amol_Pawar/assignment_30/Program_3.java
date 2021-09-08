package amol_Pawar.assignment_30;

public class Program_3 {

	void checkPalindromeNum(int input)
	{
		int revNum=0;
		int temp=input;
		while(input!=0)
		{
			int lastDigit = input % 10;
			revNum = revNum * 10 + lastDigit;
			input = input / 10;
		}
		if(temp==revNum)
			System.out.println(temp+" is Palindrome number");
			else
			System.out.println(temp+" is not Palindrome number");
		
	}
	
	public static void main(String[] args) {
		Program_3 program_3=new Program_3();
		int num=12321;
		program_3.checkPalindromeNum(num);

	}

}

/*Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number*/


