package gauravk.Assignment_16;
/*
 * Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4
 */
public class Assignment_16 {

	int getCntVisibleTree(int[] input){
		int max=0;
		int maxCnt=0;
		for (int i= 1; i<input.length; i++){
			if (input[i-1]<input[i])
				maxCnt++;
		}
		return maxCnt;
	}

	public static void main(String[] a){

		int[] treeheight = {3,5,5,11,9,10,15,14};
		System.out.println("Maximum visible tree count is = "+new Assignment_16().getCntVisibleTree(treeheight));
	}
}