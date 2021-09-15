package trupti;

public class Assignment30_1 {
	
	String getRevNumber(String input) {
		String output=" ";
		for(int index=input.length()-1;index>=0; index--) {
			output+=input.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment30_1 rev= new Assignment30_1();
		String input="1234";
		System.out.println("input number is: "+input);
		System.out.println("output reverse number is: "+rev.getRevNumber(input));
		
	}
}
