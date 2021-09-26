package ankita_CodingTest2;

public class Uplowercase {
	
	void charconvert(String str) {
		String input="";
		
		for(int index=0;index < str.length();index++) {
			char ch=str.charAt(index);
			
			if(Character.isUpperCase(ch))
				input=input + Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				input=input + Character.toUpperCase(ch);
			else
				input=input+ch;
		}
		System.out.println("After Converting " +input);
	}
	public static void main(String[] args) {
		Uplowercase uplowercase=new Uplowercase();
		uplowercase.charconvert("A1ashvi6");
	}
}
