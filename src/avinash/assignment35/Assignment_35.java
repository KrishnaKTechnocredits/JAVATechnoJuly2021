package avinash.assignment35;

public class Assignment_35 {
	/*Write a program to verify given number plat number is valid or not.
	String p1 = "MH 12 BK 4432"; //valid
	String p2 = "MH-12 BK 1432"; //valid
	String p4 = "GJ 05 MK 1123"; // Valid
	String p3 = "MH 12-BK 4432"; // invalid
	 */
	boolean flag = true;;
	void isValidLengthString(String input) {
		if(input.length()==13) {
			if(input.charAt(2)==' ' && input.charAt(5)==' ' && input.charAt(8)==' ') {
				isValid4Part(input);
			}
			else if(input.charAt(2)=='-' && input.charAt(5)==' ' && input.charAt(8)==' ') {
				isValid3Part(input);
			}
			else
				flag = false;
		}
		else {
			flag=false;
		}
	}
	
	void isValid4Part(String input) {
		if(checkCharacter(input.substring(0,2)) && checkCharacter(input.substring(6,8))) {
			if(checkCharacter(input.substring(3,5)) && checkCharacter(input.substring(9))){
				flag = true;
			}
		}
		else
			flag = false;
	}
	
	void isValid3Part(String input) {
		input = input.replace(String.valueOf(input.charAt(2))," ");
		isValid4Part(input);
	}
	
	boolean checkCharacter(String input) {
		int countAlpha = 0;
		int countDigit = 0;
		for(int index=0; index<input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index)))
				countAlpha++;
			else if(Character.isDigit(input.charAt(index))) 
				countDigit++;
		}
		if(countAlpha == 2 || countDigit == 2 || countDigit == 4)
			return true;
		else
			return false;
	}
	
	void display(String input) {
		isValidLengthString(input);
		if(flag)
			System.out.println("Valid Number Plate");
		else
			System.out.println("Invalid Number Plate");
	}
	public static void main(String[] args) {
		Assignment_35 assignment_35 = new Assignment_35();
		String p1 = "MH 12 BK 4432";
		String p2 = "MH-12 BK 1432";
		String p3 = "GJ 05 MK 1123";
		String p4 = "MH 12-BK 4432";
		assignment_35.display(p1);
		assignment_35.display(p2);
		assignment_35.display(p3);
		assignment_35.display(p4);
		
	}

}
