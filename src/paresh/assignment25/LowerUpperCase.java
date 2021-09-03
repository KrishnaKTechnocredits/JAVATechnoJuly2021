package paresh.assignment25;

/*Program2:
String str = "Ma1U2liK"
output : MUK12ali

*/
public class LowerUpperCase {
	void printUpperCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

	void printLowerCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

	void printDigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

	void printUpperCaseFirst(String arr) {
		System.out.println("Output is : ");
		printUpperCase(arr);
		printDigits(arr);
		printLowerCase(arr);
	}

	public static void main(String[] args) {
		LowerUpperCase loweruppercase = new LowerUpperCase();
		String arr = "Ma1U2liKT";
		System.out.println("Given String is : " + "\n" + arr);
		loweruppercase.printUpperCaseFirst(arr);
	}
}