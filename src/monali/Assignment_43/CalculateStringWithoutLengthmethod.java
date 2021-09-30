package monali.Assignment_43;

//Calculate Length of string without using length() method.
public class CalculateStringWithoutLengthmethod {

	int getLengthOfStringWhileLoop(String str) {
		int count = 0;
		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (Exception e) {
				break;
			}
		}
		return count;
	}

	int getLengthOfStringForLoop(String str) {
		int index = 0;
		try {
			for (index = 0;; index++) {
				str.charAt(index);

			}
		} catch (StringIndexOutOfBoundsException se) {

		}
		return index;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		CalculateStringWithoutLengthmethod withoutLength = new CalculateStringWithoutLengthmethod();
		System.out
				.println(str + " length of String is while loop-->: " + withoutLength.getLengthOfStringWhileLoop(str));
		System.out.println(str + " length of string for loop---> " + withoutLength.getLengthOfStringForLoop(str));
	}

}
