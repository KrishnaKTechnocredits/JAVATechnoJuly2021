package priti.scannerClass_CharFreq;

import java.util.Scanner;

public class Assingment_20_1 {
	int getFreqOFChar(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			if( ch==input.charAt(index)){
				count++;
			}
		}
		return count;
	}	
		
	public static void main(String[] a) {
		Assingment_20_1 assingment_20_1 = new Assingment_20_1();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter string :");
		String input= scanner.next();
		System.out.print("Please Enter character :");
		char ch = scanner.next().charAt(0);
		System.out.println("Frequency of Character "+ch+ " is : " +assingment_20_1.getFreqOFChar(input,ch));
	}
}


/*Program 1: find frequency of given character from user defined string.
	use scanner class to take word and character from user.
	input : word -> technocredits
	 ch -> e
	output : e -> 2*/
