package devendra_SurprizeTest;

import java.util.Arrays;
/*Shifting all Zeros to End Of Array*/
public class CodingTest_9Sept {
	void arrangeArray(int arr[]) {
		int output[] = new int[arr.length];
		for(int i = 0, j=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				output[j] = arr[i];
				j++;
			}
		}
		System.out.println("After Shifting Zero's to Last Position,\nOutput Array = "+ Arrays.toString(output));
	}

	public static void main(String[] args) {
		CodingTest_9Sept obj = new CodingTest_9Sept();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("Input Array = "+ Arrays.toString(arr));
		obj.arrangeArray(arr);
	}
}
