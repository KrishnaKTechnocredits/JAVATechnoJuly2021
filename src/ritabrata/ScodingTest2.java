/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/

package ritabrata;

public class ScodingTest2 {
	String getConverted(String input) {
		String str="";
		System.out.println("The input string is: "+input);
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
		return str;
	}

	public static void main(String[] args) {
		ScodingTest2 scodingTest2= new ScodingTest2();
		scodingTest2.getConverted("A1ashVi6");
	}

}
