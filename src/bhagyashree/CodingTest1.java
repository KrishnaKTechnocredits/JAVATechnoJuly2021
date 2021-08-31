/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52*/
//Hint: 6+9+16+4+17 = 52


package bhagyashree;

public class CodingTest1 {
	
	int getSumOfString(String input)
	{
		int sum=0;
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	int getSumOfDigitsinArray(String[] array)
	{
		int sum=0;
		for(int index=0;index<array.length;index++)
		{
			sum=sum+getSumOfString(array[index]);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		String[] input={"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		CodingTest1 test1=new CodingTest1();
		System.out.println("Sum of All digita available in string array is:  "+test1.getSumOfDigitsinArray(input));
		
	}

}
