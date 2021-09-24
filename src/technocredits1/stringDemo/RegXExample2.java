package technocredits1.stringDemo;

public class RegXExample2 {

	public static void main(String[] args) {
		
		String str = "maulik kanani  techno   credits";
		str = str.replaceAll("\\s+", " ");
		//System.out.println(str);
		
		String str1 = "ab5ca3aZZZb2bc1c1233";
		// [^0-9],""
		//str1.length()
		
		//String str1 = "acab";
		str1 = str1.replaceAll("[a-c][0-9]*","");
		System.out.println(str1);
		
	}
}
