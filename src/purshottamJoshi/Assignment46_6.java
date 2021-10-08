package purshottamJoshi;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Assignment46_6 {
public static void main(String[] args) {
		
		Integer[] arr = {12,33,77,56,84,99};
		Set<Integer> abc = new TreeSet<Integer>();
		for(Integer t:arr) {
			abc.add(t);
		}
		System.out.println(abc);
		
		ArrayList al = new ArrayList<>(abc);
		Integer element= (Integer) al.get(al.size()-2);
		System.out.println(element);
	}

}
