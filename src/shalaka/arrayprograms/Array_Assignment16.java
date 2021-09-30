/*program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4


And push 3 java files of each program.*/

package shalaka.arrayprograms;

public class Array_Assignment16 {

	int getVisibleTreeCount(int arr[]) {
		int visibleCount = arr[0];
		int count=1;
		//int[] arr = new int[8];
		for (int index = 1; index < arr.length; index++) {
			if (arr[index] > visibleCount) {
				visibleCount=arr[index];
				count++;
			}
				
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		Array_Assignment16 array_Assignment16 = new Array_Assignment16();
		int count = array_Assignment16.getVisibleTreeCount(treeHeights);
		System.out.println("Count of visible trees is:" + count);
	}
}
