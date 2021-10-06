package madhavi;

//Find the second largest number from Given Array.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

//Find the second largest number from Given Array.
public class Assignment_46_6 {
	public static void main(String[] args) {
		int largest = 0;
		int secondLargest = 0;
		int[] arr = { 10, 20, 50, 500, 200, 100 };
		System.out.println("An initial array of elements" + Arrays.toString(arr));
		TreeSet<Integer> al = new TreeSet<Integer>(Arrays.asList(10, 20, 50, 500, 200, 100));
		System.out.println("Convert array to TreeSet of elements: " + al);
		ArrayList<Integer> intlist = new ArrayList<>(Arrays.asList(10, 20, 50, 500, 200, 100));
		System.out.println("Convert TreeSet to  ArrayList of elements: " + intlist);

		for (int index = 0; index < intlist.size(); index++) {
			if (intlist.get(index) > largest) {
				secondLargest = largest;
				largest = intlist.get(index);
			} else if (intlist.get(index) > secondLargest) {

				secondLargest = intlist.get(index);
			}

		}
		System.out.println("The second largest number is: " + secondLargest);
	}
}
