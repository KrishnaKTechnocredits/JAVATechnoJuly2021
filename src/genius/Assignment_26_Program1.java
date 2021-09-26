package genius;

public class Assignment_26_Program1 {
	
	
	String getReverseString(String input) {
		String output = "";
		for(int index=input.length()-1;index>=0;index--) {
			output = output + input.charAt(index);
		}
		
		return output;
	}

	public static void main(String[] args) {
		String str = "This is technocredits";
		Assignment_26_Program1 assignment_26_Program1 = new Assignment_26_Program1();
		String string = assignment_26_Program1.getReverseString(str);
		System.out.println(string);

	}

}
