/*Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4*/

package ritabrata;

public class TreeVisible {
	void visibleTree(int[] input) {
		int count=0;
		int output=0;
		for(int index=0;index<input.length;index++){
			if(input[index]>output){
				count++;
				output=input[index];
			}
		}
		System.out.println("The number of visible trees: "+ count);
		//return count;
	}

	public static void main(String[] args) {
		TreeVisible tree= new TreeVisible();
		int[] arr = {3,5,5,11,9,10,15,14};
		tree.visibleTree(arr);
  }
}
