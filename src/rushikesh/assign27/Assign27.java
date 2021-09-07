package rushikesh.assign27;

import java.util.Arrays;
import java.util.Scanner;

public class Assign27 {
	void checkIdentical(int[] arr,int[] arr1) {
		System.out.println("Array1 :"+Arrays.toString(arr));
		System.out.println("Array2 :"+Arrays.toString(arr1));
		if(Arrays.equals(arr, arr1)) {
			System.out.println("identical");
		}else {
			System.out.println("Not identical");
		}
	}
	
	public static void main(String[] args) {
		Assign27 assign27=new Assign27();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter length of Array1");
		int totalElement=scanner.nextInt();
		int[] arr=new int [totalElement];
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter array numbers");
			arr[index]=scanner.nextInt();
		}
		Scanner scanner1= new Scanner(System.in);
		System.out.println("Enter length of Array2");
		int totalElement1=scanner1.nextInt();
		int[] arr1=new int [totalElement1];
		for(int index=0;index<arr1.length;index++) {
			System.out.println("Enter array numbers");
			arr1[index]=scanner1.nextInt();
		}
		assign27.checkIdentical(arr, arr1);
	}
}
