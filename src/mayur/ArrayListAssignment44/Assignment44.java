/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package mayur.ArrayListAssignment44;

import java.util.ArrayList;

public class Assignment44 {
	
	int MaxNumFromArrayList(ArrayList<Integer> al) {
		int max =0;
		for (int index=0; index<al.size();index++) {
			if(max<al.get(index)) {
				max = al.get(index);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		
		Assignment44 assignment44 = new Assignment44();
		System.out.println("Max number from an ArrayList" +al+ " is :- "+assignment44.MaxNumFromArrayList(al));

	}

}
