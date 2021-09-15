package akshay;

public class Assignment26_1 {
	
	String getReverse(String str) {
		String output = "";
		for(int index = str.length()-1; index >=0; index--) {
			output += str.charAt(index);
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Assignment26_1 reverse = new Assignment26_1();
		String input = "This is technocredits";
		System.out.println("Reverser of given string is: " +reverse.getReverse(input));
		
	}
}
