package technocredits1.stringDemo;

public class Example7 {

	public static void main(String[] args) {
		String str1 = "techno";
		String str2 = "credits";
		String str3 = str1 + str2;
		String str4 = "technocredits";
		
		if(str3.equals(str4))
			System.out.println(1);
		
		if(str3 == str4)
			System.out.println(2);
	}
}
