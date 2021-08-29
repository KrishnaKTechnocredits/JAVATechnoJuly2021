package precilla.assignment25;

import java.util.Scanner;
public class StringProgram {

	 String getValues(String string) {
		 String upper = "",lower="",digit="";
		 String values="";
		for(int index=0;index<string.length();index++) {
			char ch=string.charAt(index);
			if(Character.isUpperCase(ch)) 
				upper+=string.valueOf(ch);
			if(Character.isLowerCase(ch))
				lower+=string.valueOf(ch);
			if(Character.isDigit(ch))
				digit+=string.valueOf(ch);
			values=upper+digit+lower;
		}
		return values;
	}
	 void getVa(String string) {
		 String digit="";
		 String output="";
		 for(int index=0;index<string.length();index++){
			 char ch=string.charAt(index);
			 if(Character.isDigit(ch)) {
				 digit+=string.valueOf(ch);
			 	 continue;
			 }
			 if(digit!="") {
				 if(output!="") {
					 output = output+ "+" +digit;
				 }
				 else {
					 output=output+digit ;
				 }
			 }
			 digit="";
		 }
		 System.out.println("output = " + output);
	}
	public static void main(String[] args) {
		StringProgram stringProgram=new StringProgram();
		Scanner scanner=new Scanner(System.in);
		
		String value1="te12ch33no3credit4s";
		System.out.println("Program 1 : ");
		System.out.println("String str : " +value1);
		stringProgram.getVa(value1);
		System.out.println("\nProgram 2 :");
		System.out.print("String str : ");
		String value=scanner.next();
		System.out.println("Output : " +stringProgram.getValues(value));
		
	}
}
