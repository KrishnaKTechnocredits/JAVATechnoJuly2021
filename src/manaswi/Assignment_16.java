package manaswi;
class Assignment_16
{

	int visibleTree(int[] treeHeights)
	{
		int count=0;
		int output=0;
		for(int index=0;index<treeHeights.length;index++)
		{

			if(treeHeights[index]>output)
			{
				count++;
				output=treeHeights[index];

			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		Assignment_16 assignment_16=new Assignment_16();
		System.out.println("Count of visible trees: ");
		System.out.println(assignment_16.visibleTree(treeHeights));
	}
}