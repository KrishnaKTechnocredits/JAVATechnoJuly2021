package rushikesh.scanner_string;

import java.util.Scanner;

public class Assignment_20_Prog1 {
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
	
	/*void printFreqOfEachChar(String input) {
		for(int index=0;index<input.length();index++)
			getCharCount(input, input.charAt(index));
	}
	*/
	public static void main(String[] args) {
		Assignment_20_Prog1 assignment_20_Prog1=new Assignment_20_Prog1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String and Character to find its frequency");
		String var=scanner.next();
		char ch=scanner.next().charAt(0);
		assignment_20_Prog1.getCharCount(var, ch);
		//ex1.printFreqOfEachChar("technocredits");
	}
	
}









