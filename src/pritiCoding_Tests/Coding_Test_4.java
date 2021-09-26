package pritiCoding_Tests;
import java.util.Arrays;
public class Coding_Test_4 {
	int [] putAllZeroEleAtlastOfArrayIndex(int [] arr) {
		int[] output= new int [arr.length];
		int indexoutput=0;
		for (int index=0;index<arr.length;index++) {
			if (arr[index]!=0) {
				output[indexoutput]=arr[index];
				indexoutput++;
			}
		}return output;
	}
	
	public static void main(String[] a){
		Coding_Test_4 test4 = new Coding_Test_4();
		int input [] = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("Output Array is :" +Arrays.toString(test4.putAllZeroEleAtlastOfArrayIndex(input)));
			
			
		}
}
