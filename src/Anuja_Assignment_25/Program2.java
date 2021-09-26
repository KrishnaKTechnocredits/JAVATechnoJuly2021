/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/

package Anuja_Assignment_25;

public class Program2 {

	void display(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(ch);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Ma1U2liK";
		Program2 program2=new Program2();
		program2.display(str);
	}
}
