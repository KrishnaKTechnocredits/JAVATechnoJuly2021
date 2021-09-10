package akanksha_K;

public class Assignment25 {
	
	int getDigit(String str) {
	int sum = 0;
	String s = "";
	for (int index = 0; index<str.length();index++) {
		char ch = str.charAt(index);
		if(Character.isDigit(ch)) {
			s = s + ch;
		}
		else {
			if(!s.equals(""))
				sum= sum + Integer.parseInt(s);
			s= "";	
		}
	}
	return sum;
	}
	
	String getString (String str1) {
		String digit="";
		String uppercase="";
		String lowercase="";
		for (int index = 0; index<str1.length();index++) {
			char ch = str1.charAt(index);
			if(Character.isDigit(ch)) 
				digit= digit + ch ;
			else if (Character.isUpperCase(ch)) 	
				uppercase += ch;
				else 
				lowercase +=ch;
		}	
		return uppercase + digit + lowercase ;	
	}
	

	public static void main(String args[]) {
		String str = "te12ch33no3credit4s";
		String str1 = "Ma1U2liK";
		Assignment25 assi = new Assignment25();
		System.out.println("The sum of digits in given string is: " + assi.getDigit(str));
		System.out.println("Updated string: : " + assi.getString(str1));
	}

}
