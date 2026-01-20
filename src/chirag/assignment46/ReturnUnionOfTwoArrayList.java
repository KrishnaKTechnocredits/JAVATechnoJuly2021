package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a program to return Union of two ArrayList without duplicates.
input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
output : [10,19,33,44,12,99,110,11]*/

public class ReturnUnionOfTwoArrayList {
	
	public static void main(String[] args) {
		Integer [] input1 = {10, 19, 33, 44, 12};
		Integer [] input2 = {19, 99, 110, 11,10};
		ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(input1));
		ArrayList<Integer> al2=new ArrayList<>(Arrays.asList(input2));
		al2.removeAll(al1);
		System.out.println(al2);
		al1.addAll(al2);
		System.out.println(al1);
	}
}
