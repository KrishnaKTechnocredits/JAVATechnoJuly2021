package neha;

/**
 * Program that requires exception handling ... String str = "I have 5 years and
 * 3 months of exp"; str = "I have 15 years and 9 months of exp"; output : 15 3
 */

public class ExceptionHandlingAssignment40 {
	void extractAndDisplayDigitsByExceptionHandling(String str) {
		String[] spliStr = str.split(" ");
		for (int i = 0; i < spliStr.length; i++) {
			try {
				System.out.println(Integer.parseInt(spliStr[i]));
			} catch (NumberFormatException ne) {
				// System.out.println("Not digit");
			}
		}
	}

	public static void main(String[] args) {
		String str = "I have 15 years and 3 months of exp";
		ExceptionHandlingAssignment40 ExceptionHandling = new ExceptionHandlingAssignment40();
		ExceptionHandling.extractAndDisplayDigitsByExceptionHandling(str);
	}
}
