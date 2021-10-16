/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment46k {
		
		 public static void main(String[] args) {
				
			Integer[] arr = {10,0,0,1,0,3,0,2,6};
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
			System.out.println("Input : "+Arrays.toString(arr));
			
			
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext()) {
				if(itr.next()==0)
					itr.remove();
			}
			System.out.println("\nOutput : " + list);
		 }
}
