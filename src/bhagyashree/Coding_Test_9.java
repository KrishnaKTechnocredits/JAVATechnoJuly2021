package bhagyashree;

public class Coding_Test_9 {
	
public void findClosestNegNumber(int[] input)
	
	{
	//int currentValue=0;
	int closest=input[0];
	for(int index=0;index<input.length;index++)
	{
		if(input[index]<0)
		{
			if(closest<input[index])
			{
				closest=input[index];
			}
		}
	}
	System.out.println(closest);
}
	public static void main(String[] args)
	{
		int[] data= {-3,-9,11,8,10,-1};
		Coding_Test_9 test=new Coding_Test_9();
		test.findClosestNegNumber(data);
	}

}
