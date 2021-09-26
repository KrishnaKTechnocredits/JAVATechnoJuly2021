package monali.Assignment_25;

import java.util.Scanner;

/*Program2:
String str = "Ma1U2liK"
output : MUK12ali*/

public class StringSeggregation {

	void stringSeggregate(String str) {
		String upperCase="",lowerCase="", digits="";
		
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isUpperCase(ch))
				upperCase+=ch;
			else if(Character.isLowerCase(ch))
				lowerCase+=ch;
			else if(Character.isDigit(ch))
				digits+=ch;
		}
		System.out.println("Original String : "+ str + " Converted string : "+ upperCase+digits+lowerCase);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		//sc.next();
		new StringSeggregation().stringSeggregate(sc.next());
	}
}
