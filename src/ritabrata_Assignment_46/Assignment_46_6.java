/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/


package ritabrata_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Assignment_46_6 {
	void getSecondHighestNum(Integer[] input) {
		TreeSet<Integer> list1 = new TreeSet<Integer>(Arrays.asList(input));
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1);
		System.out.println("The 2nd highest number is: " +(list2.get(list2.size()-2)));
	}

	public static void main(String[] args) {
		Assignment_46_6 secLargrst = new Assignment_46_6();
		Integer[] inputArr = { 10,20,30,500,66,20,100};
		secLargrst.getSecondHighestNum(inputArr);
	}
}
