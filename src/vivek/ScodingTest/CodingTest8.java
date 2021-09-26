/*How many pairs can be created from below sock size array. [30] 
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5
*/
 
package vivek.ScodingTest;

public class CodingTest8 {

	void getTotalSocksPairs(int[] arr) {
		int TotalPair = 0;
		for (int index = 0; index < arr.length; index++) {
			int cnt = 1;
			for (int innerindex = index + 1; innerindex < arr.length; innerindex++) {
				if (arr[index]==arr[innerindex] && arr[index] != 0) {
					cnt++;
					arr[innerindex] = 0;
				}
			}
			TotalPair += (cnt / 2);
		}
		System.out.println(TotalPair + " is the number of socks pairs created");
	}

	public static void main(String[] args) {
		CodingTest8 codingtest8 = new CodingTest8();
		int[] arr = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		codingtest8.getTotalSocksPairs(arr);
	}
}
