package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Write a program to return Union of two ArrayList without duplicates.*/
public class UnionOfArrayLists {
	ArrayList<Integer> returnUnion(ArrayList<Integer> firstList, ArrayList<Integer> secondList){
		secondList.removeAll(firstList);
		firstList.addAll(secondList);
		return firstList;
	}
	public static void main(String[] args) {
		ArrayList<Integer> firstList = new ArrayList<>();
		firstList.add(10);
		firstList.add(19);
		firstList.add(33);
		firstList.add(44);
		firstList.add(12);
		
		ArrayList<Integer> secondList = new ArrayList<>();
		secondList.add(19);
		secondList.add(99);
		secondList.add(110);
		secondList.add(11);
		secondList.add(10);
		
		UnionOfArrayLists unionOfArrayLists = new UnionOfArrayLists();
		System.out.println(unionOfArrayLists.returnUnion(firstList,secondList));
	}
}
