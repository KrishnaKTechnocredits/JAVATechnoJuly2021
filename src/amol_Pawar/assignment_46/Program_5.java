//Remove the longest string from given Set
package amol_Pawar.assignment_46;

import java.util.HashSet;
import java.util.Set;

public class Program_5 {

	void getMaxString(HashSet<String> inputSet) {
		String maxStr = "";
		int longLength = 0;
		for (String input : inputSet) {
			if (input.length() > longLength) {
				longLength = input.length();
				maxStr = input;
			}
		}
		System.out.println("Maximum String in given Set " + inputSet + " is : " + maxStr);
	}

	public static void main(String[] args) {

		Program_5 program_5 = new Program_5();
		HashSet<String> str = new HashSet<>();
		str.add("AmolPawar");
		str.add("Techno");
		str.add("TechnoCredits");
		str.add("Amol");
		program_5.getMaxString(str);

	}

}
