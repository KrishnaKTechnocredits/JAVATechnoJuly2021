/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/
package chandani.Assignment_46;

import java.util.ArrayList;

public class Assignment46b {
	
	void getDuplicateNum(ArrayList<Integer> list, int num) {
		if (list.indexOf(num) != list.lastIndexOf(num)) {
			System.out.println(num + " Number is Duplicate");
		} else {
			System.out.println(num + " Number is not Duplicate");
		}
	}
	
	public static void main(String[] args) {

	// creating an Empty Integer ArrayList
    ArrayList<Integer> arr = new ArrayList<Integer>();

    // using add() to initialize values
    // [1, 2, 3, 4]
    	arr.add(1);
    	arr.add(2);
    	arr.add(3);
    	arr.add(4);
    	arr.add(3);
    	arr.add(2);
    	
    	Assignment46b assignment46b = new Assignment46b();
    	assignment46b.getDuplicateNum(arr, 2);
    	assignment46b.getDuplicateNum(arr, 1);
    	assignment46b.getDuplicateNum(arr, 3);
	
	}

	
}
