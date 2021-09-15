package pranita;

public class ConversionOfString {

	 void uperLowerCase(String str) {
			String input = "";

			for (int index=0; index< str.length(); index++) {
				char ch = str.charAt(index);
				if (Character.isUpperCase(ch)) {
					input= input+ Character.toLowerCase(ch);
				}
				else if (Character.isLowerCase(ch)) {
					input= input+ Character.toUpperCase(ch); 
				}
				else
					input = input + ch;
			}
			System.out.println("String : " + input);
		}

		public static void main(String[] args) {
			ConversionOfString conversionOfString = new ConversionOfString();
			conversionOfString.uperLowerCase("A1ashvi6");
		}

	}	