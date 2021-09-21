package technocredits1.code_Interview;

public class Q5 {

	public static void main(String[] args) {
		String s = " India    is    my country";
		String output = "Indis is my country";
		//System.out.println(s.replaceAll("\\s+", " ").trim());
		String ss []= s.split(" ");
		String o = "";
		for(int i=0;i<ss.length;i++) {
			if (!ss[i].equals("")) {
				o+=ss[i]+" ";
			}
		}
		System.out.println(o.trim());
	}
}
