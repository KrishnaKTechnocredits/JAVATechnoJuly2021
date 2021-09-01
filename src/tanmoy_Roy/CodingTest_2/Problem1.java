/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
*/
package tanmoy_Roy.CodingTest_2;

import java.util.Scanner;

public class Problem1 {
	
	String getOutput(String input) {
		String str="";
		    for(int i=0 ;i<input.length();i++) {
		    	char ch = input.charAt(i);
		    	if(ch >=65 && ch<=91)
		    		ch+=32;
		    	else if(ch>=97 && ch<123)
		    		ch-=32;
		    	str+=ch;
		    }
		    return str;
		   
		    
	}

	public static void main(String[] args) {
		Problem1 prg = new Problem1();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the String: ");
			String input = scan.nextLine();
			System.out.println("Output :"+ prg.getOutput(input));
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();

	}

}
