package akanksha_K_new;

import java.util.Arrays;

public class Assignment33 {
	
	int[] shiftNumbers(int[] arr) {
		int count = 0;
		int[] output = new int[arr.length];
		for (int index =0; index < arr.length; index++ ) {
			if (arr[index]!=0) {
					output[count]+=arr[index];
					count++;	
			} 
		}
		return output;	
	}
	
	int[] shiftPositiveAndNegative(int[] arr1) {
		int count = 0;
		int[] output = new int[arr1.length];
		for (int index =0; index < arr1.length; index++ ) {
			if (arr1[index]<0) {
					output[count]+=arr1[index];
					count++;	
			} 
		}
		for (int index =0; index < arr1.length; index++ ) {
			if (arr1[index]>0) {
					output[count]+=arr1[index];
					count++;	
			} 
		}
		
		return output;
	}
	
	int[] shiftPositiveNegativeZeros(int[] arr2) {
		
		int count = 0;
		int[] output = new int[arr2.length];
		for (int index =0; index < arr2.length; index++ ) {
			if (arr2[index]<0) {
					output[count]+=arr2[index];
					count++;	
			} 
		}
		for (int index =0; index < arr2.length; index++ ) {
			if (arr2[index]==0) {
					output[count]+=arr2[index];
					count++;	
			} 
		}
		for (int index =0; index < arr2.length; index++ ) {
			if (arr2[index]>0) {
					output[count]+=arr2[index];
					count++;	
			} 
		}
		return output;
	}
	
	boolean is_sequence(int var1, int var2, int var3) {
		if (2*var2 == var1+var3) {
			return true;
		}
		return false;
	}
	
	int get_sum(int var1, int var2, int var3) {
		return var1 + var2 + var3;
	}
	
	int[] get_max_sum_triple(int arr[]) {
		int[] max_triple = new int[3];
		int max_sum = 0;
		for (int index =0; index < arr.length-2; index++ ) {
			if (is_sequence(arr[index], arr[index+1], arr[index+2])) {
				int triple_sum = get_sum(arr[index], arr[index+1], arr[index+2]);
				if (triple_sum>max_sum) {
					max_sum = triple_sum;
					max_triple[0] = arr[index];
					max_triple[1] = arr[index+1];
					max_triple[2] = arr[index+2];
				}
			}
		}
		return max_triple;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,3,4,0,2,88,0,0,22,34};
		Assignment33 assi = new Assignment33();
		assi.shiftNumbers(arr);
		System.out.println("After shifting zero's to end, new array: " + Arrays.toString(assi.shiftNumbers(arr)));
		
		int[] arr1 = {1,-3,-2,11,44,55,-76,33,12};
		assi.shiftPositiveAndNegative(arr1);
		System.out.println("After shifting negative to left and positive to right, new array: " + Arrays.toString(assi.shiftPositiveAndNegative(arr1)));
	
		int[] arr2 = {1,-3,0,-76,0,0,0,1,11,44,53,33,12};
		assi.shiftPositiveNegativeZeros(arr2);
		System.out.println("After shifting negative to left, positive to right and zero's in middle, new array: " + Arrays.toString(assi.shiftPositiveNegativeZeros(arr2)));
	
		int[] arr3 = {1,3,4,5,7,3,9,44,67,1,2,3,99,10,11,12};
		int[] max_triple = assi.get_max_sum_triple(arr3);
		System.out.println("Max sum triple in the sequence is: " + Arrays.toString(max_triple));
	}
}
