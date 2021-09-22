package precilla.codingtest8;

import java.util.Arrays;
/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array.
*/
public class PairProgram {
	public static void main(String[] args) {
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		System.out.println("Test 8 :How many pairs can be created from below sock size array");
		PairProgram pairProgram=new PairProgram();
		
		System.out.println("Input:"+Arrays.toString(input));
		pairProgram.getPairs(input);
	}

	private void getPairs(int[] input) {
		
		String num="";
		int paircount=0;
		for(int index=0;index<input.length;index++) {
			int count=0;
			for(int index1=0;index1<input.length;index1++) {
				if(input[index]==input[index1]) {
					count++;
				}
			}
			if(count>=2&&num.indexOf(Integer.toString(input[index]))<0) {
				num=num+Integer.toString(input[index]);
				paircount=paircount+(count/2);	
			}
		}
		System.out.println("Output:"+paircount);
	}
}
