package margi.CodingTest;

public class CodingTest_2 {

	String getString(String input) {
		char ch;
		String output = "";
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isUpperCase(ch))
				output += Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				output += Character.toUpperCase(ch);
			else
				output += ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		CodingTest_2 codingTest_2 = new CodingTest_2();
		String str = "A1ashVi6";
		System.out.println("Output String is: " + codingTest_2.getString(str));
	}
}
