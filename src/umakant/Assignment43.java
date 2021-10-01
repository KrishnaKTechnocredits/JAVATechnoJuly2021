/*
 WAP to get length of String  without using property or method
 */
package umakant;

public class Assignment43 {

	int getStringLength(String input) {
		int index = 0;
		while (true) {
			try {
				input.charAt(index);
				index++;
			} catch (StringIndexOutOfBoundsException siobe) {
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		System.out.println(new Assignment43().getStringLength("technocredits"));
	}

}
