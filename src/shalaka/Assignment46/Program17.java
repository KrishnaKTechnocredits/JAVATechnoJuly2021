/*Example 17:
Write a program to add element at particular index of ArrayList?*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program17 {

	void addElementToGivenIndex(ArrayList<Integer> list, int index,int num) {
		try {
			list.add(index, num);
			System.out.println(list);
		}catch(IndexOutOfBoundsException ie){
			System.out.println("Not a valid Index");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(20);
		Program17 program17 = new Program17();
		program17.addElementToGivenIndex(list,5,20);
		program17.addElementToGivenIndex(list,15,20);
	}

}
