package aniket;

public class Assignment_26_1 {
	String getReverseString(String input){
		String reverse="";
		for(int index=input.length()-1;index>=0;index--) {
			reverse+=input.charAt(index);	
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		String input="This is Technocredits";
		System.out.println("Reverse string is "+new Assignment_26_1().getReverseString(input));
	}
	
}
