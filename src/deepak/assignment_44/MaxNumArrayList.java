/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package deepak.assignment_44;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class MaxNumArrayList {

	int maxNum(ArrayList<Integer> arr) {
		int maxNum=0;
		for(Integer i : arr) {
			if(i>maxNum) {
				maxNum = i;
			}
		}return maxNum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(7);
		arr.add(99);
		arr.add(53);
		arr.add(74);
		MaxNumArrayList obj = new MaxNumArrayList();
		System.out.print("Maximum Integer in the ArrayList: ");
		System.out.print(obj.maxNum(arr));
	}

}
