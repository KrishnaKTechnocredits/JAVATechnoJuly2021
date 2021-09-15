/*  4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/

package santosh;
import java.util.Arrays;
public class CodingTest_4 {
	public static void main(String[] args) {
		
	    System.out.println(" Original array: ");
        int[] arr= {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println(" Input-"+Arrays.toString(arr));
		CodingTest_4 codingTest_4=new CodingTest_4();
		codingTest_4.getZeroAtLast(arr);
}
	private int[] getZeroAtLast(int[] arr) {
		int output[] = new int[arr.length];
		int countIndex=0;
		for(int index=0;index<arr.length;index++) {
			if((arr[index])!=0) {
				output[countIndex]=arr[index];
				countIndex++;
				}
			}
		    System.out.println(" After moving 0's to the end of the array: ");
            System.out.println(" Output-"+Arrays.toString(output));
	return output;
	}
}