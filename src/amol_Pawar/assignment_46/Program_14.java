/*Example 14:
Write a program to convert Array to List.
*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_14 {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList();
		str.add("Amol");
		str.add("Techno");
		str.add("Credits");
		Set<String> set=new LinkedHashSet(str);
		System.out.println("Set values after coversion : "+set);

	}

}
