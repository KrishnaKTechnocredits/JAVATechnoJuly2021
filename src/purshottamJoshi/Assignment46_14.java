/*Example 15:
Write a program to convert Array to List.*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment46_14 {

	//1st
	List<Integer>  convertArrayToList(Integer[] input) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int a: input) {
			al.add(a);
		}
		return al;
	}
	//2nd
	List<Integer> convertArrayToList1(Integer[] arr) {
		List al =Arrays.asList(arr);
		
		return al;
		
	}
	//3rd 
	static<Integer> List convertArrayToList2(Integer[] arr) {
		List al = new ArrayList<>();
		Collections.addAll(al, arr);
		return al;
		
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,4,8,7,3,6};
		List list =new Assignment46_14().convertArrayToList(arr);
		System.out.println(list);
		System.out.println(new Assignment46_14().convertArrayToList1(arr));
		System.out.println(convertArrayToList2(arr));
	}
}
