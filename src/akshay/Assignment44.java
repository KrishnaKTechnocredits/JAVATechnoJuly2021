package akshay;

import java.util.ArrayList;

public class Assignment44 {
	
	int maxNumber(ArrayList<Integer> a1) {
		int max = 0;
		for(int index = 0; index < a1.size(); index++) {
			if(max <a1.get(index))
				max = a1.get(index);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Assignment44 assignment44 = new Assignment44();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(7);
		a.add(99);
		a.add(53);
		a.add(74);
		
		System.out.println("input: " +a);
		
		System.out.println("output: " +assignment44.maxNumber(a));
	}
	
}
