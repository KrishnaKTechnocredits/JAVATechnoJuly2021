/* Program2:
	String str = "Ma1U2liK"
	output : MUK12ali */

package monika;

public class Assignment25_Program_2 {

		void upperDigitLowerFormatOfString(String str) {
			String upperCase = "", lowerCase = "", digit = "";
			for(int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if(Character.isUpperCase(ch))
					upperCase = upperCase + ch;
				else if(Character.isLowerCase(ch))
					lowerCase = lowerCase + ch;
				else
					digit = digit + ch;
			}
			
			System.out.println("Output is : "+upperCase+digit+lowerCase);
		}

		public static void main(String[] args) {
			Assignment25_Program_2 assignment25_Program_2 = new Assignment25_Program_2();
			assignment25_Program_2.upperDigitLowerFormatOfString("Ma1U2liK");
		}

	}

