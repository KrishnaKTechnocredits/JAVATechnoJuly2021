/*
 * 
 * Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK" 
output : MUK12ali
*/
package bhakti;

public class Assignment_25_StringNumber {
	
	void getSumOfNumberFromString(String input) {
		
		int sum = 0;
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				str += input.charAt(index);
			} else {
				if (!str.equals("")) {
					sum += Integer.parseInt(str);
					str = "";
				}
			}
		}
		System.out.println(sum); 
	}
		
		
	void getStringArrange(String input) {
		String upper="";
		String lower="";
		String number="";
		for (int index =0; index< input.length(); index++) {
			char ch= input.charAt(index);
			if (Character.isLowerCase(ch)) {
				lower+=ch;
			}	
			else if (Character.isUpperCase(ch)) {
				upper+=ch;
			}else 
				number+=ch;
		}
		System.out.println(upper+number+lower);
		
	}
		

	public static void main(String[] hh){
		String input = "te12ch33no3credit4s";
		Assignment_25_StringNumber assignment_25= new Assignment_25_StringNumber();
		assignment_25.getStringArrange(input);
		assignment_25.getSumOfNumberFromString(input);
		
	}
}
