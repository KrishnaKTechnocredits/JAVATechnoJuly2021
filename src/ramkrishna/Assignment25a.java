package ramkrishna;

public class Assignment25a {
	
	void stringSeggregate(String str) {
 		String upperCase="",lowerCase="", digits="";

 		for(int index=0;index<str.length();index++) {
 			char ch=str.charAt(index);
 			if(Character.isUpperCase(ch))
 				upperCase+=ch;
 			else if(Character.isLowerCase(ch))
 				lowerCase+=ch;
 			else if(Character.isDigit(ch))
 				digits+=ch;
 		}
 		System.out.println("Original String : "+ str + " Converted string : "+ upperCase+digits+lowerCase);
 	}

 	public static void main(String[] args) {
 		
 	     Assignment25a assignment25a =	new Assignment25a();
 	     assignment25a.stringSeggregate("Ma1U2liK");
 	}

}
