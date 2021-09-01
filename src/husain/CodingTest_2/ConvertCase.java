package husain.CodingTest_2;

public class ConvertCase {
	
	void changeCase(String str) {
		
		String newStr ="";
		
		for(int index = 0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)) || str.charAt(index) == ' ')
				newStr = newStr + str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				newStr = newStr + Character.toUpperCase(str.charAt(index));
			else if(Character.isUpperCase(str.charAt(index)))
				newStr = newStr + Character.toLowerCase(str.charAt(index));
		}
		
		System.out.println("The new string with inverted caps is " +newStr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertCase cas = new ConvertCase();
		String str = "A1ashVi6 T1es6T";
		System.out.println("The given string is " + str);
		cas.changeCase(str);

	}

}
