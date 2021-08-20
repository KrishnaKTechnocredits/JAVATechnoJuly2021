package akshay;

public class ReverseString {
	
	void getReverseString(String input) {
		//char output = 0;
		System.out.print("Reverse String of given input string '" +input+ "' is: ");
		for(int index = input.length()-1; index >=0; index--)
			System.out.print(input.charAt(index));
			//output = input.charAt(index);
			//System.out.print(output);
	}
	
	public static void main(String[] args) {
		ReverseString reversestring = new ReverseString();
		String input = "technocredits";
		reversestring.getReverseString(input);
		
	}
}
