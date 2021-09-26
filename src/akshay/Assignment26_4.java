package akshay;

public class Assignment26_4 {
	
	void getSwap(int a, int b) {
		System.out.println("Before Swap: " +a+ ", "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap: " +a+ ", " +b);
	}
	
	public static void main(String[] args) {
		Assignment26_4 assignment26_4 = new Assignment26_4();
		
		assignment26_4.getSwap(30, 40);
	}
}
