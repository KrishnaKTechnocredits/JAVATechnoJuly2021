/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3
*/

package ritabrata2;

import java.util.Arrays;

public class CodingTest9 {
	void getNegative(int[] input) {
		System.out.println("The input String is: "+ Arrays.toString(input));
		int closeVal= input[0];
		for(int index=0; index<input.length;index++) {	
			if(input[index]<0) {
				if(input[index]> closeVal)
					closeVal= input[index];
			}		
		}
		System.out.println("The value closest to 8 is: "+closeVal);
	}
		
	public static void main(String[] args) {
		CodingTest9 closeValue= new CodingTest9();
		int[] input={-3,11,123,-11,-9,-55,33,44};
		closeValue.getNegative(input);
	}
}
	
