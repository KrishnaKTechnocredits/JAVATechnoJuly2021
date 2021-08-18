/*
program 1 : From given array find out count of visible trees.
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4
*/
package monika;

public class Assignment_16 {
	
	int getCountVisibleTree(int[] input) {
		int count=0, max=0;
		
		for(int index=0;index<input.length;index++) {
			if(input[index]>max) {
				max=input[index];
				count++;
			}	
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] input = { 3, 5, 5, 11, 9, 10, 15, 14 };
		Assignment_16 assignment_16=new Assignment_16();
		System.out.println("The Visible Count Of Tree is: "+assignment_16.getCountVisibleTree(input));
	}
	
}
