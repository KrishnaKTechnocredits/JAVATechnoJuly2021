package purshottamJoshi;

import java.util.*;

public class Assignment44 {

	Object getMaxNumber(ArrayList arr) {
		/*	Comparator c = null;
		arr.sort(c);*/
		Collections.sort(arr);
		return arr.get(arr.size()-1);
		
	}
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(7);
		arr.add(99);
		arr.add(53);
		arr.add(74);
		System.out.println("Max Number from ArrayList : "+new Assignment44().getMaxNumber(arr));
	}
}
