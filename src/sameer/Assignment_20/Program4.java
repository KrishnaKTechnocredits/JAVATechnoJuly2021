/*program 4 : print duplicate characters with their frequency from user defined
 * string. input : word -> aakanksha output : a -> 4 k -> 2 n -> 1 s -> 1 h -> 1*/

package sameer.Assignment_20;

public class Program4 {

	void getDuplicateCharFromString(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			if (ch == input.charAt(index)) {
				count++;
			}
		}
		if (count > 1)
			System.out.println("Duplicate Characters in String " + input + " Is " + ch + " " + count);
	}

	void getStringFromUser(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				getDuplicateCharFromString(input, ch);
		}
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		program4.getStringFromUser("aakanksha");
	}
}
