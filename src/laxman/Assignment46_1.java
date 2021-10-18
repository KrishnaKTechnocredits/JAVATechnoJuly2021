package laxman;


import java.util.ArrayList;

//Example 1 : 
//Write a program to find given number is present in the arrayList or not.

public class Assignment46_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		alist.add(6);

		System.out.println("Size of Array is " + alist.size());
		System.out.println("Number 2 is avaible in the ArrayList " + alist.contains(2));
		System.out.println("Number 4 is avaible in the ArrayList " + alist.contains(4));
		System.out.println("Number 9 is avaible in the ArrayList " + alist.contains(9));
		System.out.println("Number 0 is avaible in the ArrayList " + alist.contains(0));

	}
}
