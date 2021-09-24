package technocredits1.stringDemo;

public class Example9 {

	public static void main(String[] args) {
		String str1 = new String("Techno");
		//System.out.println(str1);
		
		str1 = "Techno";
		//System.out.println(str1);
		
		//str1 = str1.intern();
		
		String str2 = "Techno";
		
		System.out.println(str1 == str2);
	}
}
