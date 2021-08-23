//Freq of given character by user in a user defined string
package suchita;
import java.util.Scanner;

class Assignment20_1 {

	int getCharCount(String input,char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == ch)
			count++;
		}
		System.out.println("In input " +"'" +input +"'"+ " the freq of " + ch + ": " + count );
		return count;
		
	}
	
	public static void main(String[] args) {
		
		Assignment20_1 assignment = new Assignment20_1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :: ");
		String str = scanner.nextLine();
		System.out.println("Enter the charachter :: ");
		char ch = scanner.next().charAt(0);
		assignment.getCharCount(str,ch);
		//System.out.println(")
		
	}
}