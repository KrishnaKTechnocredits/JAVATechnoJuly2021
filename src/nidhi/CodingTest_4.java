package nidhi;

import java.util.Arrays;

//coding test 4
//shift zeros
//int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
//ouput : {1,6,2,3,4,5,0,0,0,0,0};

class CodingTest_4{
	
	String shiftZeros(int[] arr){
		
		int[] output = new int[arr.length];
		int cnt=0;
		for (int i=0;i<arr.length;i++){
			if (arr[i] != 0){
				output[cnt++] = arr[i];
			}
		}
		while (cnt < arr.length)
			output[cnt++]=0;
	  
	  return Arrays.toString(output);
	}
	
	public static void main(String[] arg){
		CodingTest_4 codingTest = new CodingTest_4();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println(codingTest.shiftZeros(arr));
	}
}