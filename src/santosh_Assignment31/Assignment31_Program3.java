/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66 
	   */
package santosh_Assignment31;

public class Assignment31_Program3 
{
	void getConsecutiveNumbersTriplet(int[] arr)
	{
		for (int index = 0; index < arr.length - 2; index++)
		{
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2])
			{
				System.out.println(arr[index] + ", " + arr[index + 1] + ", " + arr[index + 2]);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Assignment31_Program3 assignment31_3 = new Assignment31_Program3();
		int[] inputarray = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		assignment31_3.getConsecutiveNumbersTriplet(inputarray);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
} 

