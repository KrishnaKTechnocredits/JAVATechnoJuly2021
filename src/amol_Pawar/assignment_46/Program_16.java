/*Example 16:
Write a program to add element at particular index of ArrayList?*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;

public class Program_16 {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList();
		str.add("Amol");
		str.add("Techno");
		str.add("Credits");
		System.out.println("List before adding element : "+str);
		str.add(1, "TechnoCredits");
		System.out.println("List after adding String in 2nd Position : "+str);
		

	}

}
