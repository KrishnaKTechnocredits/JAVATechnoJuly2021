/*
 * program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7,8,9,3,21,45,46,47];
Hint : ArrayList
 */
package husain.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;

public class Program10 {
	
	void appendZero(Integer arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		for(int index = 0; index < list.size()-2; index++)
			if(list.get(index)+1 == list.get(index+1) && list.get(index+1)+1 == list.get(index+2))
				list.add(index+3, 0);
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,0,5,4,7,8,9,3,21,45,46,47};
		Program10 obj = new Program10();
		obj.appendZero(arr);
	}

}
