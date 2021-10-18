package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Assignment46_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P6 pgm6 = new Assignment46_P6();
		Integer[] inputArr = { 10,20,30,55,66,77,66,20,100,98};
		pgm6.getSecondHighestNum(inputArr);
	}

	private void getSecondHighestNum(Integer[] inputArr) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list = new TreeSet<Integer>(Arrays.asList(inputArr));
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		System.out.println("The second highest number is " +(list2.get(list2.size()-2)));
	}

}
