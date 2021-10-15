/*Example 17:
Write a program to add element at particular index of ArrayList?*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_16 {
	
	void addElementINArrayList(Integer[] input,int number) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(input));
		al.add(2,number);
		System.out.println(number+" added in arrayList : "+al);
	}
	public static void main(String[] args) {
		Integer[] arr= {1,4,5,90,50};
		new Assignment46_16().addElementINArrayList(arr,55);
		
	}

}
