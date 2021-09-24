package technocredits1.stringDemo;

public class StringImmutable {

	void main() {
		
	}
	
	static public void main(String[] args) {
		String s1 = "Maulik";
		s1.concat(" Kanani");
		System.out.println(s1); // Maulik
		
		StringBuffer sb = new StringBuffer("Maulik");
		sb.append(" Kanani");
		System.out.println(sb); // Maulik Kanani
		
		String str = "technocredits";
		StringBuilder sb1 = new StringBuilder(str);
		String temp = sb1.reverse().toString();
		System.out.println(temp.toUpperCase().charAt(1));
	}
}
