package rushikesh.codetests;

import java.util.Arrays;

public class CodeTest3 {
	
	int[] removeSpecEle(int[] arr,int num) {
		if ( num < 0 ) {
			return arr;
	    }
	    int[] anotherArray = new int[arr.length - 1];     
	    for (int i = 0, k = 0; i < arr.length; i++) {
	  
	        if (arr[i] == num) {
	                continue;
	        }
	        anotherArray[k++] = arr[i];
	     }
	     return anotherArray;
	}
	
	public static void main(String[] args) {
	CodeTest3 codeTest3=new CodeTest3();
	int [] arr= {25,14,56,15,35,56,77,18,29,49};
	System.out.println(Arrays.toString(codeTest3.removeSpecEle(arr, 14)));
	}
}
