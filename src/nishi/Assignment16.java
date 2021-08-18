package nishi;

public class Assignment16 {
	
	int countOfVisibleTrees(int[] a)
	{
		int count=0;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				count++;
				System.out.println(max=a[i]);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16=new Assignment16();
		int[] treeHeights= {3,5,5,11,9,10,15,14};
		System.out.println("The visible tree-count is :  "+assignment16.countOfVisibleTrees(treeHeights));
	}

}
