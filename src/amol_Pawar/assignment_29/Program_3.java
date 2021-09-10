package amol_Pawar.assignment_29;

public class Program_3 {
	boolean isNumPallindrome(int input) {
		int temp = 0;
		int check = input;
		while (input != 0) {
			int lastDigit = input % 10;
			temp = temp * 10 + lastDigit;
			input = input / 10;
		}

		if (temp == check) {
			System.out.print("Given String is Pallindrome and flag sent is: ");
			return true;
		} else {
			System.out.print("Given String is not Pallindrome and flag sent is: ");
			return false;
		}
	}

	public static void main(String[] args) {
		Program_3 Program_3 = new Program_3();
		int num = 12321;
		Boolean flag = Program_3.isNumPallindrome(num);
		System.out.println(flag);
	}

}
/*given number is pallindrome or not, without converting it input into String?
		 int num = 12321;
		 ans : true*/
