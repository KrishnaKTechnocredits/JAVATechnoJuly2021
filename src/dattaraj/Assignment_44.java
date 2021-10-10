package dattaraj;

import java.util.ArrayList;

public class Assignment_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(77);
		al.add(12);
		al.add(86);
		Assignment_44 assignment_44 = new Assignment_44();
		System.out.println("The maximum number from arraylist " + al + " is " + assignment_44.findMaxNumber(al));
	}
	
	int findMaxNumber(ArrayList<Integer> al) {
		int max = 0;
		for(int index=0; index<al.size(); index++) {
			if(max<al.get(index)) {
				max = al.get(index);
			}
		}
		return max;
	}
	
}
