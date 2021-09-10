package akshay;

public class Assignment26_3 {
	
	void getSwap(int a, int b) {
		int temp = 0;
		
		System.out.println("Before Swap: " +a+ ", "+b);
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap: " +a+ ", " +b);
	}
	
	public static void main(String[] args) {
		Assignment26_3 assignment26_3 = new Assignment26_3();
		
		assignment26_3.getSwap(10, 20);
	}
}
