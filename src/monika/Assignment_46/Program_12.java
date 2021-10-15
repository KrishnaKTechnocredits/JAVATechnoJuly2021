/*Example 12 :
Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]
 */
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_12 {

	ArrayList<Integer> removeAllZeros(ArrayList<Integer> list){
		ArrayList<Integer> al=new ArrayList<>();
		for(int number:list) {
			if(number!=0)
				al.add(number);
		}
		return al;
	}
	public static void main(String[] args) {
		Program_12 program_12=new Program_12();
		Integer[] num = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(num));
		System.out.println("Removed all Zero's from ArrarList: "+program_12.removeAllZeros(al));
	}
}
