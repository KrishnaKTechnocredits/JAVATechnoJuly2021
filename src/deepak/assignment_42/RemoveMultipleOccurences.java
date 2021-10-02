/*Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis*/

package deepak.assignment_42;

public class RemoveMultipleOccurences {
	void removeMultipleDuplicate(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i)
				System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		RemoveMultipleOccurences obj = new RemoveMultipleOccurences();
		obj.removeMultipleDuplicate("technocredits");

	}

}
