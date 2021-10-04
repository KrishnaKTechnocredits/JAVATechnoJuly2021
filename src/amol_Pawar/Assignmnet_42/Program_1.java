package amol_Pawar.Assignmnet_42;

public class Program_1 {

	void getString(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				str = str + ch;
		}
		System.out.println("Removed multiple occurrence of characters from given string "+input+" is : "+str);
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		program_1.getString("technocredits");
	}
}
/*
 * Program 1: Remove multiple occurrence of characters from given string.
 * 
 * input : "technocredits" output : technordis
 */
