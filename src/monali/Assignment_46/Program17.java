package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
*/
public class Program17 {

	void removeObjectFromArrayList(String[] arr) {

		List<String> list = new ArrayList<String>(Arrays.asList(arr));

		list.remove(new String("Sakshi"));
		System.out.println(list);
	}

	public static void main(String[] args) {
		String[] arr = { "Monali", "Devendra", "Sakshi", "Anvi", "Mahi" };
		Program17 p17 = new Program17();
		p17.removeObjectFromArrayList(arr);
	}
}
