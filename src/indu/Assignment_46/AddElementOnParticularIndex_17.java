/*Example 17:
Write a program to add element at particular index of ArrayList?*/
package indu.Assignment_46;

import java.util.ArrayList;

public class AddElementOnParticularIndex_17 {

	static void addElementsInArrayList()
	{
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Indu");
		alist.add("Tejal");
		alist.add("Jeet");
		alist.add("Niku");
		alist.add("kiya");
		System.out.println(alist);
		alist.add(3,"Uditi");
		System.out.println(alist);
	}
	public static void main(String[] args) {
		addElementsInArrayList();
	}
}
