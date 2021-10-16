/*Programming Questions - Collections : 4th Oct'2021
Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
*/
package shraddha.Assignment46;

import java.util.ArrayList;

public class RemoveElementFromArrayListUsingRemoveMethod {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("Hi");
		al.add("Java");
		al.add("Selenium");
		al.add("Learning");
		al.add("From");
		al.add("TechnoCredits");
		al.add("team");
		System.out.println(al);
		al.remove("Hi");
		System.out.println(al);
	}
}
