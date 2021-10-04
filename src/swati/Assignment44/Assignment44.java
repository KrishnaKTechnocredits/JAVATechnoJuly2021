package swati.Assignment44;

import java.util.ArrayList;

/*
 * Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
 */

public class Assignment44 {
	
	void findMax() {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(7);
		a1.add(99);
		a1.add(53);
		a1.add(74);
		int max=a1.get(0);
		for(int index=1;index<a1.size();index++) {
			if(max<a1.get(index)) {
				max=a1.get(index);
			}
		}
		
		System.out.println(max);
	}
	
	
	public static void main(String[] a) {
		Assignment44 a1=new Assignment44();
		a1.findMax();
		
	}

}