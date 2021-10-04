/*
 Find length of the string without using length method*/
package indu;

import java.util.Scanner;

public class FindStringLengthWithoutLengthMethod_A43 {
	
	int count =0;
	void getStringLength(String str) {

		while (true) {
			try {
				str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println("String " + str + " length is " + count);
	}

	public static void main(String[] args) {
		FindStringLengthWithoutLengthMethod_A43 a43 = new FindStringLengthWithoutLengthMethod_A43();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input string : ");
		String str = scan.next();
		a43.getStringLength(str);
	}
}
