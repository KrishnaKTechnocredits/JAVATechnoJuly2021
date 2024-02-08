
/* Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid */

package mayur;

public class Assignment_35 {
	
	boolean isDigit(String str) {
		boolean digit = false;
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				digit = true;
			else 
				digit = false;
		}
		return digit;
	}
	
	boolean isLetter(String str) {
		boolean letter = false;
		for(int index=0; index<str.length(); index++) {
			if(Character.isLetter(str.charAt(index)))
				letter = true;
			else 
				letter = false;
		}
		return letter;
	}
	
	boolean isValidCarNumber(String str) {
		String[] str1 = str.split(" ");
		int partition = str1.length;
		if(str.length()!=13) {
			return false;
		} else {
			if(partition==4) {
				if(str1[0].length()==2 && isDigit(str1[0])==false && isLetter(str1[0])==true) {
					if(str1[1].length()==2 && isDigit(str1[1])==true && isLetter(str1[1])==false) {
						if(str1[2].length()==2 && isDigit(str1[2])==false && isLetter(str1[2])==true) {
							if(str1[3].length()==4 && isDigit(str1[3])==true && isLetter(str1[3])==false) {
								return true;
							} else
								return false;
						} else
							return false;
					} else
						return false;
				} else
					return false;
			}
			else if(partition==3) {
				if(str1[0].length()==5 && (isDigit(str1[0])==true || isLetter(str1[0])==true)) {
					if(str1[1].length()==2 && isDigit(str1[1])==false && isLetter(str1[1])==true) {
						if(str1[2].length()==4 && isDigit(str1[2])==true && isLetter(str1[2])==false) {
							return true;
						} else
							return false;
					} else
						return false;
				} else 
					return false;
			}
			else {
				return false;
			}
		}
	}
	
	void displayResult(String str) {
		if(isValidCarNumber(str))
			System.out.println(str + " is a valid car number");
		else
			System.out.println(str + " is invalid car number");
	}

	public static void main(String[] args) {
		String p1 = "MH 12 BK 4432";
		String p2 = "MH-12 BK 1432";
		String p3 = "MH 12-BK 4432";
		String p4 = "GJ 05 MK 1123";
		Assignment_35 assignment_35 = new Assignment_35();
		assignment_35.displayResult(p1);
		assignment_35.displayResult(p2);
		assignment_35.displayResult(p3);
		assignment_35.displayResult(p4);
	}
}