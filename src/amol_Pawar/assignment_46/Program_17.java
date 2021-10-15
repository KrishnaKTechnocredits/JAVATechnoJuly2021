/*Example 17:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
*/
package amol_Pawar.assignment_46;

import java.util.ArrayList;

public class Program_17 {

	public static void main(String[] args) {
		ArrayList elements=new ArrayList();
		elements.add("Amol");
		elements.add("Techno");
		elements.add("sanket");
		elements.add("Techno");
		elements.add(1);
		elements.add(4);
		System.out.println("Input arrayList : "+elements);
		
		elements.remove(1);//Remove element based on index
		System.out.println("Element Techno removed based on index as we have not passed object : "+elements); 
		Integer i=1;
		elements.remove(i);//we convert 1 to object of Integer so it will remove 1 directly
		System.out.println("Element 1 removed based on object : "+elements); 
	}

}
