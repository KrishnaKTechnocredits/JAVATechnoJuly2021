package technocredits1.stringDemo;

public class Example2 {
	
	public static void main(String[] args) {
		int x = 10;
		String str = "Technocredits";
		str.toLowerCase();
		str.substring(3); //hnoc
		str.substring(str.indexOf('h'),str.lastIndexOf('t')+1);
		str.toUpperCase();
		System.out.println(str.charAt(0)); // T
		
		StringBuffer sb = new StringBuffer("Techno");
		sb.append("credits");
		System.out.println(sb);
	}
}
