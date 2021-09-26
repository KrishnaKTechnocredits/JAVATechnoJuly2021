package nishi.Assignment26;

public class Assignment26C {
	
	void swapOfTwoNumbers(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the result is "+a+ " and "+b);
	}
	public static void main(String[] args) {
		new Assignment26C().swapOfTwoNumbers(2, 3);		
	}
}
