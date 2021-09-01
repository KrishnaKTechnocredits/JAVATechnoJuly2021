package nishi.Assignment26;

public class Assignment26D {

	void swapOfTwoNumbersWithoutUsingThirdVariable(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;		
		System.out.println("After swapping the result is "+a+ " and "+b);
	}
	public static void main(String[] args) {
		new Assignment26D().swapOfTwoNumbersWithoutUsingThirdVariable(2, 3);		
	}

}
