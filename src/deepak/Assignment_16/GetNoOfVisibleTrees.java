//Assignment 16 [Program 1] [find out count of visible trees] DATE: 08/16
package deepak.Assignment_16;

public class GetNoOfVisibleTrees {
	
	int getVisibleTreeCount(int[] array) {
		int maxNum=array[0];
		int visibleCnt=1;
		for(int i=0;i<array.length;i++){
			if(array[i]>maxNum){
				maxNum=array[i];
				visibleCnt++;
		}
	}return visibleCnt;
	}
	public static void main(String[] args) {
		GetNoOfVisibleTrees obj=new GetNoOfVisibleTrees();
		int[] treeHeights= {3,5,5,11,9,10,15,14};
		System.out.print("Number of visible trees are: ");
		System.out.println(obj.getVisibleTreeCount(treeHeights));
	}

}
