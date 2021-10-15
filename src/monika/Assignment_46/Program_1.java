/*Example 1 : 
Write a program to find given number is present in the arrayList or not.*/

package monika.Assignment_46;
import java.util.ArrayList;

public class Program_1 {

	static void getNumberisPresentinArrayListorNot(int i) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(33);
		al.add(69);
		al.add(19);
		al.add(64);
		System.out.println("The "+i+" is present in the ArrayList: "+al.contains(i));
	
	}
	public static void main(String[] args) {
		Program_1.getNumberisPresentinArrayListorNot(33);
		Program_1.getNumberisPresentinArrayListorNot(55);
	}
}
