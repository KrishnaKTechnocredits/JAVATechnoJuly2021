/*Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

package deepak.assignment_42;

public class RemoveAllOccurences {
	void removeAllDuplicate(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		RemoveAllOccurences obj = new RemoveAllOccurences();
		obj.removeAllDuplicate("technocredits");

	}

}
