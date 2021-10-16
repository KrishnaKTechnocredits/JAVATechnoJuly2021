package precilla.assignment46;

import java.util.ArrayList;
import java.util.Arrays;


//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
public class Program18 {
	public static void main(String[] args) {
		Integer[] a= {1,4,5,8,9,6,10};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println("Before Removing list \n"+al);
		al.remove(new Integer(6));
		al.remove(new Integer(10));
		al.remove(new Integer(1));
		System.out.println("After Removing element 1,6 and 10 \n"+al);
		}

}
