package deven_dc.assign;
public class Assignment17_RevStr {
	String reverseString(String str) {
		String str1 = "";
		char[] s = str.toCharArray();	

		for(int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + s[i];	
		}
		return str1;
	}

	public static void main(String[] args) {
		Assignment17_RevStr a17_revstr = new Assignment17_RevStr();
		System.out.print("Reverse Of String 'TechnoCredits' : ");
		System.out.print(a17_revstr.reverseString("T e c h n o C r e d i t s"));
	}
}
