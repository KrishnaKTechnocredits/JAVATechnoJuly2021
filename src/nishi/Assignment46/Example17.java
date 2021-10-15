/*Example 17:
Write a program to add element at particular index of ArrayList?*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example17 {
	public static void main(String[] args) {
		String[] arr= {"Ankita","Ram","Priya","Nandini"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		al.set(1, "Neha");
		System.out.println("After adding elemnt at paricular pos new list is "+al);
		
		
	}
}
