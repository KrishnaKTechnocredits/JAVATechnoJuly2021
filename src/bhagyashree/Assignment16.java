//program 1 : From given array find out count of visible trees. 
package bhagyashree;

public class Assignment16 {
	
	int count=0;
	int max=0;
	int getCountVisibleTrees(int[] array)
	{
		for(int index=0;index<array.length;index++)
		{
			if(array[index]>max)
			{
				max=array[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int treeHeights[]= {3,5,5,11,9,10,15,14};
		Assignment16 assignment16=new Assignment16();
		System.out.println("Total count of visible tree is:  "+assignment16.getCountVisibleTrees(treeHeights));
	}

}
