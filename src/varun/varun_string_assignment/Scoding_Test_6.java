package varun.varun_string_assignment;

public class Scoding_Test_6 {
	
	void findFirstUniqueChar(String str) {
		for(int index =0;index<str.length();index++) {
				if(index == str.lastIndexOf(str.charAt(index))) {
					System.out.println("First Unique Character from the given string is:- " +str.charAt(index));
					break;
				
			}
		}
	}
	public static void main(String[] args) {
		String input = "technocredits";
		Scoding_Test_6 scoding_Test_6 = new Scoding_Test_6();
		scoding_Test_6.findFirstUniqueChar(input);
	}
}
