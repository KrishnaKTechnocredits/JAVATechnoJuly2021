//Convert all lowercase to uppercase and uppercase to lowercase in a given string.
//Input : A1ashVi6
//Output : a1ASHvI6

package parthav;

public class ConvertUpperToLowerViceVersa {
	
	String convertLowerToUpperViceVersa (String inputStr) {
		
		String newString = "";
		
		for (int index = 0;index < inputStr.length();index++) {
			char ch = inputStr.charAt(index);
			if (Character.isUpperCase(ch)) {
				newString = newString + Character.toLowerCase(ch);
				
			}
			else if (Character.isLowerCase(ch))
				newString = newString + Character.toUpperCase(ch);
			else
				newString = newString + ch;
		}
		
		return newString;
		
	}

	public static void main(String[] args) {
		ConvertUpperToLowerViceVersa newObject = new ConvertUpperToLowerViceVersa();
		String inputStr = "A1ashVi6";
		System.out.println("The string " + inputStr + " is now converted to: " + newObject.convertLowerToUpperViceVersa(inputStr));

	}

}
