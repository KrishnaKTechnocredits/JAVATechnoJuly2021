/*Example 15:
Write a program to convert Array to List.*/

package nishi.Assignment46;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example15 {
	public static void main(String[] args) {
		String[] arr= {"Ankita","Ram","Priya","Nandini"};
		List<String> al=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al);
	}
}
