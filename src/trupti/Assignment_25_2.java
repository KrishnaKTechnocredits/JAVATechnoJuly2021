package trupti;

public class Assignment_25_2 {

	public static void main(String[] args) {
		Assignment_25_2 output=new Assignment_25_2();
		String str="Ma1U2liK";
		output.getUpperLowerDigitInString(str);
		
	}
	
	void getUpperLowerDigitInString(String str) {
		String upper="";
		String lower="";
		String a="";
		
		for(int index=0; index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				a+=ch;
			}else {
			if(Character.isUpperCase(ch)) {
				upper+=ch;
			}else {
			if(Character.isLowerCase(ch)) {
				lower+=ch;
			}
			}
			}
		}
		System.out.println(upper+a+lower);
	}
}
