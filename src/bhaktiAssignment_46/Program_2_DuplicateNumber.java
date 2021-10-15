package bhaktiAssignment_46;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_2_DuplicateNumber {
//Example 2 :	Write a program to find given number is duplicate in arrayList.
	static void  isNumberDuplicate(Integer[] num, int n) {
		ArrayList al1= new ArrayList (Arrays.asList(num));
		if (al1.contains(n)) {	
			if (al1.indexOf(n)==al1.lastIndexOf(n)) 
				System.out.println(n+" -->Number is Not Duplicate in ArrayList ");
			else 
				System.out.println(n+" --> Number is duplicate in ArrayList ");
		}else 
			System.out.println("Provided number is not present in list");
	}
	// by using Array 
		static void isNumberDuplicateinArray(Integer[] input, int n) {
			int count=0;
			for (int i=0; i< input.length; i++) {
				if (input[i]==n)
					count ++;
			}
			if (count>1) {
				System.out.println(n+" -number is duplicate");
			}else
				System.out.println(n+" -number is NOT duplicate");
			
		}
		
		public static void main(String[] args) {
			Integer[] input = { 1, 6, 2, 9, 6,3, 0, 2, 4 };
			isNumberDuplicate(input, 6);
			isNumberDuplicate(input, 9);
			isNumberDuplicate(input, 10);
			
			isNumberDuplicateinArray(input, 1);
			isNumberDuplicateinArray(input, 2);
		}
		
}

