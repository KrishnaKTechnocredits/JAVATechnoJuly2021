package aniket;

public class Assignment_26_3 {
	void getSwapTwoNumbers(int a,int b) {//10,20
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of A after swap :"+ a + " Value of B after swap :" + b);
		
		
	}
	
	void getWithoutThirdVarSwap(int a,int b) {//30 40
		a=a+b;//70
		b=a-b;//30
		a=a-b;//40
		System.out.println("Value of A after swap :"+ a + " Value of B after swap :" + b);
		
	}
	
	public static void main(String[] args) {
		
		Assignment_26_3 assignment_26_3 = new Assignment_26_3();
		assignment_26_3.getSwapTwoNumbers(10, 20);
		assignment_26_3.getWithoutThirdVarSwap(30, 40);
		
	}
}
