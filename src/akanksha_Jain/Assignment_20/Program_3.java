package akanksha_Jain.Assignment_20;

import java.util.Scanner;

public class Program_3 {

	void findUniqueChar(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count =0;
			for(int index1=0; index1<str.length(); index1++) {
				if(str.charAt(index1) == ch)
					count ++;
			}
			if(count==1)
				System.out.println(str.charAt(index) + " -> " + count);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		Program_3 program_3 = new Program_3();
		program_3.findUniqueChar(str);
		scanner.close();
	}
}
