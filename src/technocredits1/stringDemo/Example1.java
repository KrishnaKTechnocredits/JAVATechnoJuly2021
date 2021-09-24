package technocredits1.stringDemo;

public class Example1 {

	public static void main(String[] args) {
		String str = "Technocredits";
		str.charAt(0);
		String temp = String.valueOf(10.10);
		
		String str1 = "Technocredits";
		String str2 = "technoCredits";
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		
		String str3 = "TE12ChnoCredits";
		System.out.println(str3.toLowerCase());
	}
}
