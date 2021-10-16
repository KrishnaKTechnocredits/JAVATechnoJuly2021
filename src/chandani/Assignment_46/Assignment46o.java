/*Example 17:
Write a program to add element at particular index of ArrayList?*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment46o {
	
	void addElementInArrayList(String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input List : " + list);
		list.add(3, "NewUser");
		System.out.println("After adding element in list : " + list);
	}

	public static void main(String[] args) {
		String[] arr = { "User1", "User2", "User3", "User4", "User5" };
		Assignment46o assignment46o = new Assignment46o();
		assignment46o.addElementInArrayList(arr);
	}

}
