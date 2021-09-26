package gauravk.Assignment_25;
/*
 * Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali
 */
public class ReturnTotalOfNumChunksInString {
	
	void sumOfNumsInString(String str) {
		int sum = 0;
		String s = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				s = s + ch;
				//sum += Integer.parseInt(s);
			}
			else {
				if (s.length()>0) {
					sum = sum + Integer.parseInt(s);
					s="";
				}
			}
		}	
		System.out.println("The sum of numbers in the string ["+str+"] is "+sum);
	}
	
	public static void main(String[] args) {
		String input = "te12ch33no3credit4s";
		new ReturnTotalOfNumChunksInString().sumOfNumsInString(input);
	}
}