/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package sayli_Vyavhare;

import java.util.ArrayList;
import java.util.Arrays;

class MaxNum_UsingArraylist_44{
	
	int getMaxNum(Integer[]  input) {
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(input));
		int maxnum=0;
		for(int number:arr) {
			if(maxnum<number) {
				maxnum=number;
			}
		}
		return maxnum;
		
	}
	public static void main(String[] args) {
		MaxNum_UsingArraylist_44 max= new MaxNum_UsingArraylist_44();
		Integer[] input= {10,7,99,53,74};
		System.out.println("Maximum number is :" +max.getMaxNum(input));
	}
}