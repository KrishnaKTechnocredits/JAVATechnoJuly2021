package neha;

//WAP to iterate over string without using string length method or array length property
public class StringExceptionAssignment43 {
	void iterateOverStringCharacters(String str) {
		int index = 0;
		Boolean flag = true;
		System.out.println("Iterate over string without using string length method or array length property:");
		while (flag) {
			try {
				System.out.println("Character at index " + index + " : " + str.charAt(index));
				index++;
			} catch (StringIndexOutOfBoundsException se) {
				flag = false;
				break;
			}
		}
	}

	public static void main(String[] args) {
		StringExceptionAssignment43 stringAssignment43 = new StringExceptionAssignment43();
		String input = "Technocredits";
		stringAssignment43.iterateOverStringCharacters(input);
	}
}
