package ashit;
import java.util.Arrays;
	
public class Assignment_27 {
		 void getIdenticalArray(int array1[], int array2[]) {

			 if(Arrays.equals(array1, array2)) {
				 System.out.println(Arrays.toString(array1) + " and " + Arrays.toString(array2));
				 System.out.println("Both Arrays are identical");
			 }
			 else {
				 System.out.println(Arrays.toString(array1) + " and  " + Arrays.toString(array2));
				 System.out.println("Both Arrays are not identical");
			 }	 
		 }


		 public static void main(String[] args) {
			 int[] arr1 = {10,12,55,32,17};
			 int[] arr2 = {10,12,55,32,17};
			 int[] arr3 = {10,12,55,32,17,99};
			 int[] arr4 = {10,12,55,32,17};
			 int[] arr5 = {10,12,55,32,17};
			 int[] arr6 = {10,12,99,32,17};

			 Assignment_27 assi = new Assignment_27();
			 assi.getIdenticalArray(arr1, arr2);
			 assi.getIdenticalArray(arr3, arr4);
			 assi.getIdenticalArray(arr5, arr6);
		 } 
	}


