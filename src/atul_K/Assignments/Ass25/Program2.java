/* Program2:
String str = "Ma1U2liK"
output : MUK12ali */
package atul_K.Assignments.Ass25;

public class Program2 {

	public static void main(String[] args) {
		String str = "Ma1U2liK";
		Program2 p2 = new Program2();
		System.out.println(p2.arrangeCharacter(str));
	}
	
	String arrangeCharacter(String str) {
		String cupper ="";
		String clower ="";
		String cdigit ="";
		
		for(int index=0;index< str.length();index++) {
			if (Character.isUpperCase(str.charAt(index))) { 
				cupper += str.charAt(index);
			}else if(Character.isLowerCase(str.charAt(index))) {
				clower += str.charAt(index);
			}else if (Character.isDefined(str.charAt(index))){
				cdigit += str.charAt(index);
			}
		}
		return cupper+cdigit+clower;
	}
}
