package indrani;
import java.util.Scanner;

public class Assignment_20_program1 {
	
	int getCharCount(String input,char ch) {
		int i=0;
		int count=0;
		int n=input.lastIndexOf(ch);
		while(i<=n) {
			if(input.charAt(i)==ch)
				count++;
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment_20_program1 program1 =new Assignment_20_program1();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		System.out.println("Enter the character to get the count: ");
		char ch = scan.next().charAt(0);
		System.out.println("The character count is: "+program1.getCharCount(input,ch));
		scan.close();
	}
}
