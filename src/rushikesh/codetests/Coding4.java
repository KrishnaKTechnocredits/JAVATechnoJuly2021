package rushikesh.codetests;

import java.util.Arrays;

public class Coding4 {
	
	void arrangeArray(int [] arr) {
		int[] output=new int[arr.length];
		int count=0;
		for(int index=0; index<arr.length; index++) {
			if(arr[index]!=0) {
				output[count]=arr[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));		
	}

	public static void main(String[] args) {	
		Coding4 coding4=new Coding4();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		coding4.arrangeArray(arr);
	}
}
