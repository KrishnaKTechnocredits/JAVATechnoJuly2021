package indrani;

import java.util.Scanner;

public class Assignment_20_program2 {
	
	static void getFreqOfChar(String input) {
		Assignment_20_program1 program2= new Assignment_20_program1();
		int i=0;
		int n=input.length();
		while(i<n) {
			if(i==input.lastIndexOf(input.charAt(i)))
				System.out.println("The "+input.charAt(i)+" count is: "+program2.getCharCount(input,input.charAt(i)));
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