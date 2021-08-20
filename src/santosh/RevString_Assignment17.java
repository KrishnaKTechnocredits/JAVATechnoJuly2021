package santosh;
 public class RevString_Assignment17 {
	String reverseString(String str) {
		String str1 = "";
		char[] s = str.toCharArray();	

		for(int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + s[i];	
		}
		return str1;
	}

	public static void main(String[] args) {
		RevString_Assignment17 revstring_17 = new RevString_Assignment17();
		System.out.print("\n Reverse String of 'TechnoCredits'is : ");
		System.out.print(revstring_17.reverseString("TechnoCredits"));
	}
}
 