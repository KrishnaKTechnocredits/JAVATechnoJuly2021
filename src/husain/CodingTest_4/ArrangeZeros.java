package husain.CodingTest_4;

import java.util.Arrays;

public class ArrangeZeros {
	
	void arrangeArray(int arr[]) {
		int output[] = new int[arr.length];
		for(int i = 0, j=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				output[j] = arr[i];
				j++;
			}
		}
		System.out.println("The new array is "+ Arrays.toString(output));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrangeZeros obj = new ArrangeZeros();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("The original array is "+ Arrays.toString(arr));
		obj.arrangeArray(arr);

	}

}
