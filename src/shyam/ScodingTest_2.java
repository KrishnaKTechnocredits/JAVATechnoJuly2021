package shyam;

public class ScodingTest_2 {
	
	
	String upperToLowerViceVersa(String input) {
		String output = "";
		for (int index=0;index<input.length(); index++) {
			char ch =input.charAt(index);
			if(Character.isUpperCase(ch)) 
				output = output + Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				output = output + Character.toUpperCase(ch);
			else
				output = output + ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		ScodingTest_2 codingtest2 = new ScodingTest_2();
		String input = "A1ashVi6";
		codingtest2.upperToLowerViceVersa(input);
		System.out.println("Input--" + input + "---Upper to Lower & Lower to Upper is-->" + codingtest2.upperToLowerViceVersa(input));
	}
}
