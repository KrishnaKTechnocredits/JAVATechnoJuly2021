package rushikesh.scanner_string;

import java.util.Scanner;

public class Assignment_20_Prog4 {
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
	
	void printDuplicateChar(String input) {
		for(int index=0;index<input.length();index++)
		   if (input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index)))
			  if(index==input.indexOf(input.charAt(index)))
			   getCharCount(input, input.charAt(index));
		}
	
	public static void main(String[] args) {
		Assignment_20_Prog4 assignment_20_Prog4=new Assignment_20_Prog4();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String to find its Duplicate Character ");
		String var=scanner.next();
		 assignment_20_Prog4.printDuplicateChar(var);
	}
	
}







