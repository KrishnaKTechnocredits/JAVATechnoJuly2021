package swati;
class FindCountOfVisibleTrees{
	
	int returnVisibleTreeCount(int[] input){
		int small=input[0];
		int count=1;
		for(int index=1;index<input.length;index++){
			if(input[index]>small){
				count++;
				small=input[index];
			}
		}
		return count;
		
	}
	
	public static void main(String[] a){
		FindCountOfVisibleTrees findtreeCount=new FindCountOfVisibleTrees();
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		int treeCount=findtreeCount.returnVisibleTreeCount(treeHeights);
		System.out.println("Total visible trees: "+treeCount);
		
	}
}