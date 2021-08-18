/*program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98


program 4 : print difference between max odd number and max even number from given array. difference should be positive*/

package sushant;

public class Assignment_14_B {

	int diffrenceBetweenEvenMaxAndOddMin(int[] input)
	{
		int diff= 0;
		int evenMax = input[0] ;
		int oddMax = input[0] ;
		for(int index=0 ; index < input.length ; index++)
		{
			if(input[index]>evenMax || input[index]>oddMax )
			{
				if(input[index] %2 == 0 )

					evenMax = input[index];
				else 

					oddMax = input[index];
			}

		}
		if(evenMax > oddMax)
		{
			diff = evenMax - oddMax;
		}
		else 
		{
			diff = oddMax - evenMax;
		}

		return diff ;
	}

	public static void main(String arg[])
	{

		Assignment_14_A assignment_a = new Assignment_14_A();
		int[] input = {1,11,44,23,55,99,23};
		int min = assignment_a.findMinNumber(input);
		int max = assignment_a.findMaxNumber(input);
		System.out.println("Difference between max and min numbers is : " + (max-min));	

		Assignment_14_B assignment_b = new Assignment_14_B();
		System.out.println("Diffrence between oddmax and evenMax is : " + assignment_b.diffrenceBetweenEvenMaxAndOddMin(input));
	}
}
