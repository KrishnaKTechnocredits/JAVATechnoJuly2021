package manaswi;
public class Assignment_15_Program_1
 {
static int x=10;
	int getDifferenceEvenOddLength(String[] num) 
	{
		int sumEven=0;
		int sumOdd=0;
		for (int index=0;index<num.length;index++) 
		{
			if(num[index].length()%2==0)
				sumEven+=num[index].length();
			else
				sumOdd+=num[index].length();
		}
		return sumEven-sumOdd;
	}

	public static void main(String[] args)
	{
		String[] input = {"Maulik","Techno","Nidhi","Ankit"};
		Assignment_15_Program_1 assignment_15_Program_1 = new Assignment_15_Program_1();
		System.out.println("Difference of even length name and odd length name is "+assignment_15_Program_1.getDifferenceEvenOddLength(input));
	}

}