package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Find duplicates using hashset
public class Example14 {
	public static void main(String[] args) {
		float[] data = {44.0f, 10.10f, 10.34f, 32.12f, 44.0f, 10.34f};
		
		Set<Float> numberSet = new HashSet<Float>();
		for(float num : data) {
			if(!numberSet.add(num))
				System.out.println("Duplicate number :" + num);
		}
		
		//-----------------------------------
		System.out.println("-----------------------------");
		ArrayList<Float> numList = new ArrayList<Float>();
		for(float num : data) {
			if(numList.contains(num)) {
				System.out.println("Duplicate number :" + num);
			}else {
				numList.add(num);
			}
		}
	}
}
