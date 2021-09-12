/*Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25
*/

package vivek.ScodingTest;

public class CodingTest7 {
	
	void getTripletsCount(int[] arr) {
		int cnt =0;
		for (int index = 0; index < arr.length-2; index++) {
			if (arr[index] < arr[index+1] && arr[index+1] < arr[index+2])
				cnt++;
		}
		System.out.println("Count of number of triplets is " + cnt);
	}

	public static void main(String[] args) {
		CodingTest7 codingtest7 = new CodingTest7();
		int[] arr = {10,9,11,6,23,25,22,66,34};
		codingtest7.getTripletsCount(arr);
	}
}
