package monika;

public class Assignment15_Program_2 {

	char[] getMidCharOfStringArray(String[] str) {
		int midIndex=0;
		
		char[] output=new char[str.length];
		for( int index=0;index<str.length;index++) {
			if(str[index].length() % 2 == 0) {
				midIndex = str[index].length()/2 - 1;
			}else { 
				midIndex = str[index].length() / 2;
			}
			output[index]=str[index].charAt(midIndex);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = { "hello", "techno", "credits" };
		char[] output = new char[input.length];
		Assignment15_Program_2 assignment15_Program_2 = new Assignment15_Program_2();
		output = assignment15_Program_2.getMidCharOfStringArray(input);
		for (int index = 0; index < output.length; index++) 
			System.out.println("Middle Character of string '" + input[index] + "' is " + output[index]);
	}
}
