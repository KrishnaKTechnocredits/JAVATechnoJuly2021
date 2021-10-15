package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_10_1 {
	ArrayList<Integer> getMissingNumber(Integer[] input) {
		
		 ArrayList<Integer> al = new ArrayList(Arrays.asList(input));
		 ArrayList<Integer> al2 = new ArrayList();
		 	
		 for(int index=1; index <=10 ; index++) {
			 if(!al.contains(index)) {
				 al2.add(index);
			 }
		 }
		 	return al2;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,6,2,5,7,6,3,10};
		System.out.println("Missing Numbers from aray are "+new Assignment46_10_1().getMissingNumber(arr));
		
	}

}
