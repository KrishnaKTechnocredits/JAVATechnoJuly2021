package nidhi;

import java.util.Arrays;

class Codingtest_3{
	
	String removeAnElement(int[] arr, int num){
		int[] arroutput = new int[arr.length - 1];
		boolean flag = false;
		for (int i=0; i< arr.length; i++){
			if (arr[i] == num){
				flag = true;
			} else {
				if (flag)
				arroutput[i-1] = arr[i];
				else
					arroutput[i] = arr[i];
			}
		}
		return Arrays.toString(arroutput);
	}
	
	public static void main(String[] arg){
		Codingtest_3 codingtest = new Codingtest_3();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int removeNbr = 14;
		System.out.println(codingtest.removeAnElement(input, removeNbr));
	}
}