package chirag.assignment44;

import java.util.ArrayList;

/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/

public class FindMaxNumFromArrayList {
	
	void getMaxNumFromArray(ArrayList<Integer> al) {
		int maxNum= al.get(0);
		for(int index =0;index < al.size();index++) {
			if(al.get(index) > maxNum) {
				maxNum = al.get(index);
			}
		}
		System.out.println("Maximum number form an ArrayList : "+maxNum);
	}
	
	public static void main(String[] args) {
		FindMaxNumFromArrayList findMaxNumFromArrayList = new FindMaxNumFromArrayList();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		findMaxNumFromArrayList.getMaxNumFromArray(al);
	}
}