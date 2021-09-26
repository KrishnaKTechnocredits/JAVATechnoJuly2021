
/* SHIFT ALL ZERO'S END OF THE ARRAY
      INPUT-{1,2,0,1,2,0,1,2,0,1,2}
      OUTPUT-{1,2,1,2,1,2,1,2,0,0,0}
      */
 

package somnath;
import java.util.Arrays;
public class CodingTest_4 {
	public static void main(String[] args) {
		System.out.println("SHIFT ALL ZERO'S END OF THE ARRAY.");
		int[] arr= {1,2,0,1,2,0,1,2,0,1,2};
		System.out.println(" INPUT-"+Arrays.toString(arr));
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
		System.out.println("OUTPUT-"+Arrays.toString(output));
	return output;
	}
}
