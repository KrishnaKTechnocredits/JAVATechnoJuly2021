package chandani.chandani_CodingTest_6;

public class CodingTest6 {
	
	char getNonRepeatingNumber(String input) {
		
		char ch = ' ';
		for(int index = 0; index < input.length();index++) {
			if(index == input.lastIndexOf(input.charAt(index))) {
			    ch = input.charAt(index);
			    break;
			}
		}
		return ch;
	}


	public static void main(String[] args) {
		CodingTest6 codingTest6 = new CodingTest6();
		String input = "technocredits";
		System.out.println("Non repeating letter in the given word is : " + codingTest6.getNonRepeatingNumber(input));	
	}
}
