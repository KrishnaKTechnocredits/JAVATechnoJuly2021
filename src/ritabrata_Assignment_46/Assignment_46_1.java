/*Example 1 : 
Write a program to find given number is present in the arrayList or not.
*/


package ritabrata_Assignment_46;
import java.util.ArrayList;
public class Assignment_46_1 {
	void findGivenNo(ArrayList<Integer> input, int num) {
		if(input.contains(num))
			System.out.println("Number "+num + " is present in the arraylist");
		else
			System.out.println("Number "+num + " is not present in the arraylist");
	}

	public static void main(String[] args) {
		Assignment_46_1 intArrList = new Assignment_46_1();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(20);
		inputArray.add(40);
		inputArray.add(60);
		inputArray.add(80);
		inputArray.add(50);
		
		intArrList.findGivenNo(inputArray, 25);
		intArrList.findGivenNo(inputArray, 50);

	}

}
