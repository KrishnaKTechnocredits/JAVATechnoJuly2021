package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Assignment46_P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P8 pgm8 = new Assignment46_P8();
		Integer[] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println(pgm8.getNegativeNumber(input));
	}

	LinkedList<Integer> getNegativeNumber(Integer[] input){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		LinkedList<Integer> negativeNumList = new LinkedList<Integer>();
		for(int index=0; index<list.size();index++) {
			if(list.get(index) < 0 )
				if(index == list.indexOf(list.get(index)))
					negativeNumList.add(list.get(index));				
		}
		return negativeNumList;
	}

}
