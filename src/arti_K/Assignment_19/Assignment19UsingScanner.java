/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4

program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70
 */

package arti_K.Assignment_19;

import java.util.Scanner;

public class Assignment19UsingScanner {
	
	//Program 1 :
	void countWords(String input) {
		String[] str = input.split(" ");		
		System.out.println("Word count in given String is : "+str.length);
	}
	
	//Program 2 :
	void maxLenWord(String input) {
		String[] str = input.split(" ");
		String max = str[0];
		for(int index = 0; index < str.length; index++) {
			if(str[index].length() > max.length())
				max = str[index];
		}
		System.out.println(max+" Word has maximum Length as "+max.length());
	}
	
	//Program 3 :
	void minLenWord(String input) {
		String[] str = input.split(" ");
		String min = str[0];
		for(int index = 0; index < str.length; index++) {
			if(str[index].length() < min.length())
				min = str[index];
		}
		System.out.println(min+" Word has minimum Length as "+min.length());
	}
	
	//Program 4 :
	void sumOfNum(String input) {
		int sum = 0;
		String[] str = input.split(" ");
		for(int index = 0; index < str.length; index++) {
			sum = sum + Integer.parseInt(str[index]);
		}
		System.out.println("Sum of Numbers in given String is : "+sum);
	}
	
	public static void main(String[] args) {
		Assignment19UsingScanner assign = new Assignment19UsingScanner();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Statement : ");
		String stmnt = sc.nextLine();
		assign.countWords(stmnt);
		System.out.println("\nEnter Statement : ");
		String stmnt1 = sc.nextLine();
		assign.maxLenWord(stmnt1);
		System.out.println("\nEnter Statement : ");
		String stmnt2 = sc.nextLine();
		assign.minLenWord(stmnt2);
		System.out.println("\nEnter Statement : ");
		String stmnt3 = sc.nextLine();
		assign.sumOfNum(stmnt3);
	}

}
