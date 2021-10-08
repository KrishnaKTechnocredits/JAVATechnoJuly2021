package bhaktiAssignment_46;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_1_numberPresent {
	//1. Write a program to find given number is present in the arrayList or not.
		static void  isNumberPresent_1(Integer[] num, int n) {
			ArrayList al1= new ArrayList (Arrays.asList(num));
			if (al1.contains(n)) 
				System.out.println(n+" -->Number is present in ArrayList ");
			else 
				System.out.println(n+" --> Number is Not present in ArrayList ");
		}
		
	 
		public static void main(String[] args) {
			Integer [] array1={5,1,3,9};
			Integer[] array2={5,1,3,9};
			 
			isNumberPresent_1(array1, 2);
			
		}
}

