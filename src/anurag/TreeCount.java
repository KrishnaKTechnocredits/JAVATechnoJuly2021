package anurag;

public class TreeCount {
	
	int visibleTrees(int height[])
	{
	int visible=0;
	int count=0;
	for(int index=0;index<height.length;index++)
	{
	if(height[index]>visible)
	{
	visible=height[index];
	count++;
	}


	}
	return count;
	}
	public static void main(String []args)
	{
	TreeCount treeCount=new TreeCount();
	int[] treeHeights = {3,5,5,11,9,10,15,14};
	System.out.println("Total visible trees - " +treeCount.visibleTrees(treeHeights));

	}
}
