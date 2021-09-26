package rushikesh.assign26;

public class Assign26_1 {
	String getRevString(String input) {
		String output = "";

	    for (int i = input.length() - 1; i >= 0; i--) {
	        output = output + input.charAt(i);
	    }
	    return output;
	}
	public static void main(String[] args) {
		Assign26_1 assign26_1=new Assign26_1();
		String input = "This is technocredits";
		String op=assign26_1.getRevString(input);
		System.out.println(op);
	}
}
