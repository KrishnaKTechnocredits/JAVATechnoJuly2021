/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/

package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_3 {

	void removeDuplicate(Integer[] input){
		
		ArrayList al = new ArrayList<>(Arrays.asList(input));
		ArrayList al2 = new ArrayList<>();
				
		for(int index=0; index < al.size(); index++) {
			if(al.indexOf(al.get(index)) == al.lastIndexOf(al.get(index))) {
				al2.add(al.get(index));
				
			}
		}
		System.out.println(al2);
		
	}
	public static void main(String[] args) {
		Integer[] arr = {1,2,4,5,3,7,5,9};
		new Assignment46_3().removeDuplicate(arr);
	}
}
