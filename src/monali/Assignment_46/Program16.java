package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Example 17:
Write a program to add element at particular index of ArrayList?
*/
public class Program16 {

	void addElementInArrayList(String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Original List : " + list);
		list.add(3, "Ravi");
		System.out.println("After adding element in list : " + list);
	}

	public static void main(String[] args) {
		String[] arr = { "Monali", "Devendra", "Sakshi", "Anvi", "Mahi" };
		Program16 p16 = new Program16();
		p16.addElementInArrayList(arr);
	}
}
