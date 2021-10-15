
/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
package monika.Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_3 {
	static void removeDuplicateNumbers(ArrayList<Integer> input) {
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0; index<input.size(); index++) {
			if(input.indexOf(input.get(index))==index)
				output.add(input.get(index));
			
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 9, 3, 4, 5, 9, 6, 6, 7, 8));
		Program_3.removeDuplicateNumbers(numbersList);
	}
}
