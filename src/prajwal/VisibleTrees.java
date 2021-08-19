package prajwal;

public class VisibleTrees {
	
	int countOfVisibleTress(int[] arr)
	{
		int Max=0;
		int count=0;
		for(int i=0; i<arr.length; i++)
		if(arr[i]>Max)
		{
			Max=arr[i];
			count++;
		}
		return count;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	VisibleTrees visibletrees = new VisibleTrees();
	int[] arr= {3,5,5,11,9,10,15,14};
	System.out.println("count of visible tree is " +visibletrees.countOfVisibleTress(arr));
	}
}
