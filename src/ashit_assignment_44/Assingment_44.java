/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/

package ashit_assignment_44;

import java.util.ArrayList;

public class Assingment_44 {
	int getMaxNumber() {	
		ArrayList<Integer> al = new ArrayList<Integer> ();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		int max=0;
		//System.out.println(al);
		for (int index=0;index<al.size();index++) {
			int num = al.get(index);
			if (num>max)
				max=num;
		}
		return max;
	}
	public static void main(String[] a) {
		Assingment_44 assingment_44 = new Assingment_44();
		System.out.println("Max number from ArrayList:"+assingment_44.getMaxNumber());
	}

}

