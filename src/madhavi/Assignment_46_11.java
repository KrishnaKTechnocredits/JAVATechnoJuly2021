package madhavi;

import java.util.Arrays;
import java.util.*;

public class Assignment_46_11 {
	public static void main(String[] args) {
		ArrayList<Integer> numArray = new ArrayList<Integer>(Arrays.asList(1, 6, 2, 5, 7, 6, 3, 10));
		ArrayList<Integer> opNumArray = new ArrayList<Integer>();

		for (int index = 1; index <= 10; index++) {
			// Checking the missing numbers...
			if(!numArray.contains(index))
			{
				opNumArray.add(index);
			}	
		}
		
		System.out.println("Output : "+opNumArray);
	}

}
