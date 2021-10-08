/*Example 1 : 
Write a program to find given number is present in the arrayList or not.*/
package indu.Assignment_46;

import java.util.ArrayList;

public class FindNumberinArraylistOrNot_1 {

	static ArrayList<Integer> findGIvenNUmberInArrayLIst(int num)
	{
		ArrayList<Integer> listNum= new ArrayList<Integer>();
		listNum.add(10);
		listNum.add(11);
		listNum.add(3);
		listNum.add(45);
		listNum.add(90);
		listNum.add(34);
		
		System.out.println("\nInput list is : "+listNum);
		//System.out.println("\n"+num+" is present in the ArrayList: "+listNum.contains(num));
		
		if(listNum.contains(num))
			System.out.println("\n"+num+" is present in the ArrayList");
		else
			System.out.println("\n"+num+" is not present in the ArrayList");
		return listNum;
		
	}
	public static void main(String[] args) {
		
		findGIvenNUmberInArrayLIst(11);
		findGIvenNUmberInArrayLIst(12);
	}
}
