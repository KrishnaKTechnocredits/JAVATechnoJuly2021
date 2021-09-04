package manaswi;
public class Assignment_27 
{

	void checkIdenticalArray(int[] input1, int[] input2)
	{
		boolean isIdentical = true;
		if (input1.length == input2.length) 
		{
			for (int index = 0; index < input1.length; index++) 
			{
				if (input1[index] != input2[index]) 
				{
					isIdentical = false;
					break;
				}
			}
			if (isIdentical)
				System.out.println("Identical array");
			else
				System.out.println("Not identical array");
		} else
			System.out.println("Not identical array");
	}

	public static void main(String[] args)
	{
		Assignment_27 identicalArray = new Assignment_27();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 17, 24, 25 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		int[] arr5 = { 10, 12, 66, 32, 17 };
		int[] arr6 = { 10, 12, 66, 32, 18 };
		identicalArray.checkIdenticalArray(arr1, arr2);
		identicalArray.checkIdenticalArray(arr3, arr4);
		identicalArray.checkIdenticalArray(arr5, arr6);

	}
}