package gauravk.Assignment_44;

import java.util.ArrayList;

/*
 * Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
 */
public class FindMaxNumFromArrayList {
	
	void findMaxNum(ArrayList<Integer> arr) {
		int maxNum=0;
		int i=0;
		for(; i<arr.size();i++) {
			int x=arr.get(i);
			if(x>maxNum)
				maxNum=x;
		}
		System.out.println("The max number is "+maxNum+" (using normal for loop with ArrayList).");
		
		for(int num : arr) {
			if(num>maxNum)
				maxNum=num;
		}
		System.out.println("The max number is "+maxNum+" (using enhanced for loop with ArrayList).");
	}
	
	public static void main(String[] args) {
		ArrayList <Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(7);
		num.add(99);
		num.add(53);
		num.add(74);
		FindMaxNumFromArrayList max = new FindMaxNumFromArrayList();
		max.findMaxNum(num);
	} 
}
