package margi.Assignment_26;

public class Assignment_26_1 {
	
	//to print reverse a given string
	void reverseStr(String input) {
		String output = "";
		for(int index=input.length()-1; index >=0; index--) {
			output = output + input.charAt(index);
		}
		System.out.println(output); 
	}
	
	public static void main(String[] args) {
		Assignment_26_1 assignment_26_1 = new Assignment_26_1();
		String input = "This is technocredits";
		assignment_26_1.reverseStr(input);
	}
}
