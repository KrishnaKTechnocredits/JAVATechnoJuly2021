package neha.assignment_29;
/*program 3 : given number is pallindrome or not, without converting it input into String?
		 int num = 12321;
		 ans : true*/

public class NumPallindromePg3 {
	void findAndDisplayPallindromeNum(int num) {
		int tempNum = num;
		int newNum = 0;
		while (tempNum > 0) {
			newNum = tempNum % 10 + newNum * 10;
			tempNum = tempNum / 10;
		}
		if (num == newNum)
			System.out.println("Number " + num + " is pallindrome");
		else
			System.out.println("Number " + num + " is not pallindrome");
	}

	public static void main(String[] args) {
		NumPallindromePg3 numPallindromePg3 = new NumPallindromePg3();
		int num = 12321;
		numPallindromePg3.findAndDisplayPallindromeNum(num);
		num = 45678;
		numPallindromePg3.findAndDisplayPallindromeNum(num);
	}
}