package technocredits1.stringDemo;

public class Example8 {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		
		str2 = str1;
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		String str3 = "hello";
		String str4 = new String("Hello");
		System.out.println(str3 == str4); // false
		System.out.println(str3.equalsIgnoreCase(str4));// true
	}
}
