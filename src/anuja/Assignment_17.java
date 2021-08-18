package anuja;

public class Assignment_17 {
	
	String getReverseString(String input) {
		int count=input.length();
		String output="";
		for(int i=(count-1);i>=0;i--) {
			output=output+input.charAt(i);
		}
			return output;
	}
			
	public static void main(String args[]) {
		Assignment_17 assignment_17=new Assignment_17();
		String input="Technocredits";
		System.out.println("String is "+input);
		String ans=assignment_17.getReverseString(input);
		System.out.println("Reverse String is "+ans);
		}
	}


