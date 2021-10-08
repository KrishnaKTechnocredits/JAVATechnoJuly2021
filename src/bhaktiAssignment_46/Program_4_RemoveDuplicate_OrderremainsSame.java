package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_4_RemoveDuplicate_OrderremainsSame {
	
	static void remOveDuplicates(ArrayList input) {
		 Set hs= new LinkedHashSet(input);
		System.out.println(hs);
	}
	
	
	public static void main(String[] args) {
		Integer[] input = { 1,7, 6, 2, 9, 6,3,7, 0, 2, 4 };
		ArrayList al1= new ArrayList (Arrays.asList(input));
		String[] str1= {"Bhakti","Harshada", "Amol", "Amruta" ,"Harshada", "Amol"};
		ArrayList al2=new ArrayList(Arrays.asList(str1));
		remOveDuplicates(al1);
		remOveDuplicates(al2);
	}
	
}


