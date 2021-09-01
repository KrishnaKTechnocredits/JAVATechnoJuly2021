package margi.Assignment_25;

public class Assignment_25_2 {

	//arrange string with uppercase, numbers, lowercase
	void getString(String input) {
		String strUpper = "";
		String strLower = "";
		String strNum = "";
		char ch;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isUpperCase(ch)) 
				strUpper = strUpper + String.valueOf(ch);
			
			else if(Character.isDigit(ch)) 
				strNum = strNum + String.valueOf(ch);
			
			else
				strLower = strLower + String.valueOf(ch);
		}
		System.out.println(strUpper + strNum + strLower);
	}
	
	public static void main(String[] args) {
		Assignment_25_2 assignment_25_2 = new Assignment_25_2();
		String str = "Ma1U2liK";
		assignment_25_2.getString(str);
	}
}
