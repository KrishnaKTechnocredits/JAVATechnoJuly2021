/*Program2:
String str = "Ma1U2liK"
output : MUK12ali
*/

package parthav.parthavD_Assignment25;

public class Program2 {

	void shiftChars (String inputStr) {	
		String outputStr = "";
		for (int index = 0;index < inputStr.length();index++) {
			char ch = inputStr.charAt(index);
			if (Character.isUpperCase(ch)){
				outputStr += ch;
			}
		}
		
		for (int index = 0;index < inputStr.length();index++) {
			char ch = inputStr.charAt(index);
			if (Character.isDigit(ch)){
				outputStr += ch;
			}
		}
		
		for (int index = 0;index < inputStr.length();index++) {
			char ch = inputStr.charAt(index);
			if (Character.isLowerCase(ch)){
				outputStr += ch;
			}
		}
		
		System.out.println(outputStr);
		
	}

	public final static void main(String[] args) {
		new Program2().shiftChars("Ma1U2liK");

	}

}
