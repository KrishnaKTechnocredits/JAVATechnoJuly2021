/*Program2:
String str = "Ma1U2liK"
output : MUK12ali
*/

package tanmoy_Roy.Assignment25;

import java.util.Scanner;

public class Program1 {
	
	String getOutput(String input) {
		return input.replaceAll("[^A-Z]", "")+input.replaceAll("[^0-9]", "")
		+input.replaceAll("[^a-z]", "");
		
	}

	public static void main(String[] args) {
		Program1 prg =new Program1();
		Scanner scan =new Scanner(System.in);
		char ch='Y';
		while(true) {
			
			if (ch=='Y' || ch=='y') {
				System.out.println("Enter the string : ");
				String input = scan.nextLine();
				System.out.println("Output : "+prg.getOutput(input));
			}
			else {
				System.out.println("Program Exited ");
				break;
			}
			System.out.println("Want to check more (Y/N) : ");
			ch = scan.nextLine().charAt(0);
		}
		scan.close();
	}

}
