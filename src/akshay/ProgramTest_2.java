package akshay;

import java.util.Scanner;

public class ProgramTest_2 {
	
	String convertCase(String str) {
		String temp = "";
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) 
				temp = temp + Character.toLowerCase(ch); 
			else if(Character.isDigit(ch))
				temp = temp + ch;
			else if(Character.isLowerCase(ch))
				temp = temp + Character.toUpperCase(ch);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		ProgramTest_2 test = new ProgramTest_2();
		//String str = "A1AshVi6";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String Here: ");
		String str = sc.next();
		System.out.println("Converted String is: " +test.convertCase(str));
	}
}
