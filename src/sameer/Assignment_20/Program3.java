/*program 3: print unique characters from user defined string. input : word ->
 * aakanksha output : n s h*/

package sameer.Assignment_20;

public class Program3 {
	void getStringFromUser(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println("Unique Characters From User Defined String " + input + " Is" + " : " + ch);
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		program3.getStringFromUser("technocredits");
	}

}
