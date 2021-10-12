package precilla.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import precilla.throwthrowsesception.E;

/*
Example 17:
Write a program to add element at particular index of ArrayList?
*/
public class Program17 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(25);
		System.out.println("Before Inserting at particular index : \n" +al);
		al.add(1,65);
		al.add(2,98);
		al.add(3,99);
		System.out.println("After Inserting at particular index : \n" +al);
		
		
		
	}

}
