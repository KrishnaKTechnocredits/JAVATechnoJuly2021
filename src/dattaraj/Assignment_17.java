package dattaraj;

public class Assignment_17 {
	String getReverseString(String input) {
		String output = "";
		for(int index=input.length();index>0;index--)
		{
			output = output + input.charAt(index-1);

		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_17 assign17 = new Assignment_17();
		String input = "technocredits";
		assign17.getReverseString(input);
		System.out.println("Reverse of input string of '" + input + "' is '" + assign17.getReverseString(input)+"'");
	}
}
