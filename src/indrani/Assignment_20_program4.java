package indrani;

import java.util.Scanner;

public class Assignment_20_program4 {
	
	static void getFreqOfChar(String input) {
		Assignment_20_program1 program4= new Assignment_20_program1();
		int i=0;
		int n=input.length();
		int charCount=0;
		System.out.println("The duplicate charaters are ");
		while(i<n) {
			charCount=program4.getCharCount(input,input.charAt(i));
			if(i==input.lastIndexOf(input.charAt(i))  && charCount>1 )
				System.out.println(input.charAt(i)+" with frequency "+ charCount);
			i++;
		}
		
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		getFreqOfChar(input);
		scan.close();
		
	}
}
