/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/
package shreya_assignment_33;

import java.util.Arrays;

public class RearrangeElements {
	int[] getElements(int[] input) {
		int count=0;
		int negativeCount=0;
		int[] output=new int[input.length];
		
		for(int index=0;index<input.length;index++) {
			if(input[index]<0) {
				output[negativeCount]=input[index];
				negativeCount++;
			}
			else if(input[index]==0) {
				count++;
			}
		}
		int positiveCount=count+negativeCount;
		
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) {
				output[positiveCount]=input[index];
				positiveCount++;
			}
		}
		System.out.println("After shifting all negative numbers at the beginning, zeros and all positive numbers at the end:\n "+Arrays.toString(output));
		return output;
	}
	public static void main(String[] args) {
		RearrangeElements rearrangeElements=new RearrangeElements();
		int[] input= {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		rearrangeElements.getElements(input);
	}

}
