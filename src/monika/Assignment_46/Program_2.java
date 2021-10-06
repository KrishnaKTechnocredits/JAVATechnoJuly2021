/*Example 2 :
Write a program to find given number is duplicate in arrayList.
*/
package monika.Assignment_46;

import java.util.ArrayList;

public class Program_2 {

	static void findDuplicateNumberinArryList() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(150);
		al.add(65);
		al.add(82);
		al.add(47);
		al.add(100);
		al.add(65);
		al.add(150);
		al.add(82);
		for(int index=0; index<al.size();index++) {
			int num = al.get(index);
			if(al.indexOf(num) != al.lastIndexOf(num)) {
				if(index == al.indexOf(num))
					System.out.println("Duplicate Number : " + num);
			}
		}
		
	}
	public static void main(String[] args) {
		Program_2.findDuplicateNumberinArryList();
	}
	
}
