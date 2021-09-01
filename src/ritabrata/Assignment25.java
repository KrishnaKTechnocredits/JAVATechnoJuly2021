/*Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/

package ritabrata;

public class Assignment25 {
	void getIntValues(String input) {
		String output="",digit="";
		System.out.println("The input string is "+input);
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			
			if(Character.isDigit(ch)) {
				digit+= String.valueOf(ch);
				continue;
			}
			if (digit!="") {
				if (output!="")
					output= output+"+"+digit;
				else
					output= output+digit;
			}
			digit="";
		}
		System.out.println("The output string is: "+output);
		
	}
	void arrangeString(String input) {
		String upperCase="", lowerCase="", digit="";
		System.out.println("The input string is "+input);
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(Character.isUpperCase(ch)) 
				upperCase+=ch;
			else if(Character.isDigit(ch)) 
				lowerCase+=ch;
			else if (Character.isLowerCase(ch))
				digit+=ch;
		}
		System.out.println("The rearranged string is: "+upperCase+lowerCase+digit);
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25= new Assignment25();
		assignment25.getIntValues("te12ch33no3credit4s");
		System.out.println("----------------------------------------------------");
		assignment25.arrangeString("Ma1U2liK");
		
	}
}
