package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(110);
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(110);
		numList.add(110);
		numList.add(110);
		
		/*for(int num : numList) {
			if(numList.indexOf(num) != numList.lastIndexOf(num))
				System.out.println("Duplicate num : " + num);
		}*/
		
		for(int index=0; index<numList.size();index++) {
			int num = numList.get(index);
			if(numList.indexOf(num) != numList.lastIndexOf(num)) {
				if(index == numList.indexOf(num))
					System.out.println("Duplicate num : " + num);
			}
		}
		
	}
}
