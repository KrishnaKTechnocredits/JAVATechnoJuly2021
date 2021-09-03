package genius;

public class Assignment_25_Program2 {
	
	String getOutputString(String input) {
		String output1 = "";
		String output2 = "";
		String output3 = "";
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output1 = output1 + ch;
			}
			if(Character.isDigit(ch)) {
				output2 = output2 + ch;
			}
			if(Character.isLowerCase(ch)) {
				output3 = output3 + ch;
			}
		}
		return output1+output2+output3;
	}

	public static void main(String[] args) {
		String str = "Ma1U2liK";
		Assignment_25_Program2 assignment_25_Program2 = new Assignment_25_Program2();
		String ans = assignment_25_Program2.getOutputString(str);
		System.out.println(ans);

	}

}
