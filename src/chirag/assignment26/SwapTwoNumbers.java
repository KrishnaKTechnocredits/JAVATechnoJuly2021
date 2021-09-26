package chirag.assignment26;

public class SwapTwoNumbers {
	
	void swapTwoNumbersWithoutUsingThirdVariable() {
		int a= 10;
		int b = 20;
		int c =0;
		System.out.println("a = "+a+"\nb = "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping :");
		System.out.println("a = "+a+"\nb = "+b);
	}
	public static void main(String[] args) {
		SwapTwoNumbers swapTwoNumbers =new SwapTwoNumbers();
		swapTwoNumbers.swapTwoNumbersWithoutUsingThirdVariable();
		
	}

}
