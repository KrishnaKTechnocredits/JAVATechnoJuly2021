package technocredits1.stringDemo;

public class RegXExample1 {

	public static void main(String[] args) {
		String str = "Ab2C1";
		str = str.replaceAll("[A-Z][0-9]", "");
		System.out.println(str);
		
		String str1 = "Ab2C1";
		str1 = str1.replaceAll("[A-Z0-9]", "");
		System.out.println(str1);
		
	}
}
