package dattaraj;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment46_P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P12 pgm12 = new Assignment46_P12();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(0);
		list.add(2);
		list.add(6);
		System.out.println(list);
		System.out.println(pgm12.removeZeros(list));
	}
	
	ArrayList<Integer> removeZeros(ArrayList<Integer> input){
		Iterator<Integer> itr = input.iterator();
		while(itr.hasNext()) {
				if(itr.next() == 0)
					itr.remove();
		}
		return input;
	}

}
