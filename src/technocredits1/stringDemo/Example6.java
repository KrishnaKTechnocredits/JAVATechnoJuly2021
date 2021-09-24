package technocredits1.stringDemo;

public class Example6 {

	public static void main(String[] args) {
		String str1 = "techno";
		String str2 = "technocredits";
		str1 = str2.substring(0,4);
		String str4 = "tech";
		//String str3 = str2.substring(0,6); // "techno"
		String str3 = str2.replace("credits", "");
		System.out.println(str1 == str3); // 
		
		
		
	}
}
