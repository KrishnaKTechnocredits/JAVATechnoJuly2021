package chirag.assignment26;

public class SwapTwoNumbersWithoutThirdVariable {
	
	void swapTwoNumbers(int a,int b) {
		System.out.println("Number a : "+a+"\nNumber b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : \na : "+a+"\nb : "+b);
	}
	public static void main(String[] args) {
		SwapTwoNumbersWithoutThirdVariable swapTwoNumbersWithoutThirdVariable=new SwapTwoNumbersWithoutThirdVariable();
		swapTwoNumbersWithoutThirdVariable.swapTwoNumbers(15,45);
	}

}
