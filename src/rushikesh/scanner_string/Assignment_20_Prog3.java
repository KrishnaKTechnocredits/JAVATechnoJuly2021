package rushikesh.scanner_string;

import java.util.Scanner;

public class Assignment_20_Prog3 {
	int getCharCount(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("In word " +input+ " " +ch+":"+count);
		return count;
	}
	
	void printUniqueChar(String input) {
		for(int index=0;index<input.length();index++)
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				getCharCount(input, input.charAt(index));
		}
	
	public static void main(String[] args) {
		Assignment_20_Prog3 assignment_20_Prog3=new Assignment_20_Prog3();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String to find its unique character ");
		String var=scanner.next();
		assignment_20_Prog3.printUniqueChar(var);
	}
	
}







