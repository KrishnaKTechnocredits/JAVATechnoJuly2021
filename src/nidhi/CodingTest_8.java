package nidhi;

/**Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
**/

import java.util.Arrays;
class CodingTest_8{

	int sockSizeArrray(int[] arr){
		Arrays.sort(arr);
		int sockcnt=0;
		for (int i=0;i<arr.length-1;i++){
			if (arr[i] == arr[i+1]){
					i=i+1;
					sockcnt++;
			}
		}
		return sockcnt;
	}
	
	public static void main(String[] arg){
		CodingTest_8 codingtest= new CodingTest_8();
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,4,8,8,4};
		System.out.println(codingtest.sockSizeArrray(input));
	}
}
