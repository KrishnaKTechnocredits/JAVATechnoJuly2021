package akshay;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElement {
	
	void removeElement(int[] arr, int num) {
		int [] output= new int [arr.length-2];
		int ouputindex = 0;
		for(int index = 0; index < arr.length-1; index++) {
			if(arr[index] != num) {
				output[ouputindex++] = arr[index];
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		RemoveArrayElement remove = new RemoveArrayElement();
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Scanner sc = new Scanner(System.in);
		System.out.println("Specific Number : ");
		int num = sc.nextInt();
		remove.removeElement(arr, num);
	}
}
