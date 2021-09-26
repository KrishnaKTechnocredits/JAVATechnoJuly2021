package himanshu_Common_Programs;

public class Palindrome_Number {

	void palindromeMethod(int no) {

		int temp = no;
		int rev = 0;
		int rem = 0;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		if (no == rev)
			System.out.println(no + " is Palindrome Number");
		else
			System.out.println(no + " is not Palindrome Number");
	}

	public static void main(String[] args) {

		Palindrome_Number no = new Palindrome_Number();
		no.palindromeMethod(12321);

	}

}
