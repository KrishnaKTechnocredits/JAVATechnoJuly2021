/*Example 5 : 
Remove the longest string from given Set.*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment46_5 {

	static void removeLongestString(ArrayList<String> al) {
		String name = "";
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index).length() > name.length())
				name = al.get(index);
		}
		al.remove(name);
		System.out.println(al);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vivek", "patil", "techno", "credits", "accenture");
		ArrayList<String> al = new ArrayList<String>(list);
		Assignment46_5.removeLongestString(al);
	}
}
