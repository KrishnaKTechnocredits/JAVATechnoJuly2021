/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package bhaktik_Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_48_10 {
	
	public static void main(String[] args) {
		Integer[] input= {1,2,3,4,5,6};
		ArrayList<Integer> ar1= new ArrayList(Arrays.asList(input));
		
		for (int i=0; i <ar1.size()-2; i++) {
			 if (ar1.get(i)+1==(ar1.get(i+1)) && ar1.get(i+1)+1 == ar1.get(i+2)) {
				 ar1.add(i+3, 0);
			 }
		}
		System.out.println(ar1);
	}

}
