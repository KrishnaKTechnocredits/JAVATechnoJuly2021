package rushikesh.codetests;

public class CodeTest2 {	
	void getUpperLower(String input)
	{
		String str="";
		System.out.println("The given string is: "+input);
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(Character.isUpperCase(ch)) {
				str= str+ Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)) {
				str= str+ Character.toUpperCase(ch);
			}
			else if (Character.isDigit(ch)){
				str= str+ ch;
			}

		}
		System.out.println("The output string is: "+str);
	}
					
	public static void main(String[] args) {
	CodeTest2 codeTest2=new CodeTest2();
	String input="A1ashVi6";
	codeTest2.getUpperLower(input);

	}
}

/*

Convert all lowercase to uppercase and uppercase to lowercase in a given string.
Input : A1ashVi6
Output : a1ASHvI6*/