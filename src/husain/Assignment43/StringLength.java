/*
 * find string length without usng length() or length property of array
 */

package husain.Assignment43;

public class StringLength {

	void findLength(String str) {

		int count = 0;
		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}

		System.out.println("The length of the string \"" + str + "\" is " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringLength len = new StringLength();
		String str = "techno credits";
		len.findLength(str);

	}

}
