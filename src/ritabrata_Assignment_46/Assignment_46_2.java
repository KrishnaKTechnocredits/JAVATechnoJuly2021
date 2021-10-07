/*Example 2 :
Write a program to find given number is duplicate in arrayList.
*/
package ritabrata_Assignment_46;
import java.util.ArrayList;
public class Assignment_46_2 {
	void isElementDuplicate(ArrayList<Integer> list1, int num) {
		if (list1.indexOf(num) != list1.lastIndexOf(num))
			System.out.println("Number "+num +" is duplicate in the list");
		else
			System.out.println("Number "+num +" is unique in the list");
	}

	public static void main(String[] args) {
		Assignment_46_2 intArrList = new Assignment_46_2();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(20);
		inputArray.add(40);
		inputArray.add(60);
		inputArray.add(60);
		inputArray.add(50);
		intArrList.isElementDuplicate(inputArray, 20);
		intArrList.isElementDuplicate(inputArray, 60);
	}
}



