package rushikesh.scanner_string;

import java.util.Scanner;

public class Assignment_20_Prog2 {
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
	
	void printFreqOfEachChar(String input) {
		for(int index=0;index<input.length();index++)
			if(index==input.indexOf(input.charAt(index)))
				getCharCount(input, input.charAt(index));
		}
	
	public static void main(String[] args) {
		Assignment_20_Prog2 assignment_20_Prog2=new Assignment_20_Prog2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String to find its frequency of each character ");
		String var=scanner.next();
		assignment_20_Prog2.printFreqOfEachChar(var);
	}
	
}






