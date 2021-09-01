package varun.varun_string_assignment;

public class Scoding_Test_2 {
	void changeStringCase(String str) {
		String input="";
		String output="";
		for(int index=0;index<str.length();index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				input = ""+str.charAt(index);
				output+= input.toLowerCase();
			}
			else if(Character.isLowerCase(str.charAt(index))) {
				input = ""+str.charAt(index);
				output+= input.toUpperCase();
			}
			else if(Character.isDigit(str.charAt(index))) {
				output += str.charAt(index);
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Scoding_Test_2 scoding_Test_2 = new Scoding_Test_2();
		String input = "A1ashVi6";
		scoding_Test_2.changeStringCase(input);
	}
}
