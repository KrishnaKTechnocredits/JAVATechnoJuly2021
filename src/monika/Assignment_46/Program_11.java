/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
*/
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_11 {
	static ArrayList<Integer> getMissingNumbers(ArrayList<Integer> al){
		
		ArrayList<Integer> number=new ArrayList<>();
		for(int index=1; index<=10; index++) {
			if(!al.contains(index))
				number.add(index);
			
		}
		return number;
	}
	public static void main(String[] args) {
		Integer[] arr = { 1, 6, 2, 5, 7, 6, 3, 10 };
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
		System.out.println("Misssing Numbers in givern Range is: "+Program_11.getMissingNumbers(al));
	}

}
