package manaswi;

public class Coding_Test_9
 {

	int getClosestNumber(int[] input)
	{
		int closest = input[0];
		for (int index = 0; index < input.length; index++)
		{
			if(input[index] < 0) 
			{
				if(closest < input[index])
				{
					closest = input[index]; 
				}
			}
		}
		return closest;
	}

	public static void main(String[] args) 
	{
		Coding_Test_9 codingTest_9 = new Coding_Test_9();
		int[] arr = { -3, 11, 123, -11, -9, -55, 33, 44 };
		System.out.println("Closest negative number to 0: " + codingTest_9.getClosestNumber(arr));
	}
}