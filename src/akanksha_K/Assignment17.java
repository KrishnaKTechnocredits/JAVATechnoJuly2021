package akanksha_K;

public class Assignment17 {
	
	String getreverseString(String input) {
		String output = " ";
		for (int index= input.length()-1; index>=0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	public static void main(String args[]) {
		Assignment17 assignment17 = new Assignment17();
		String reversestring= assignment17.getreverseString("technocredits");
		System.out.println(reversestring);
	}
}
