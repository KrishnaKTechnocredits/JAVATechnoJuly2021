package swati.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList
 */

public class Append0After3Consecutive {
	
	void appendZeroAfter3Consecutive(Integer[] input) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int index=0;index<input.length;index++) {
			if(index<input.length-1) {
				int num=input[index];
				if(input[index+1]==num+1 && (input[index+2]==num+2)) {
					list1.add(input[index]);
					list1.add(input[index+1]);
					list1.add(input[index+2]);
					list1.add(0);
					index=+2;
				}else
					list1.add(input[index]);
			}else
				list1.add(input[index]);
		}
		System.out.println(list1);
		
	}
	
	public static void main(String[] a) {
		Append0After3Consecutive a1=new Append0After3Consecutive();
		Integer[] input= {1,2,3,5,4,7};
		a1.appendZeroAfter3Consecutive(input);
		
	}
}

