package chandni_bhoj_Assignment_26;

public class Program_3 {
	
	void swapTwoNumbersUsingVariable (int a, int b) {
		System.out.println ("Value of variable before swap is " + a +" , " + b );
		int c = 0;
		c = b;
		b = a;
		a = c;
		System.out.println ("Value of variable post swap is " + a +" , " + b );
	}
	
	public static void main(String[] args) {
		new Program_3().swapTwoNumbersUsingVariable(25, 40);
	}

}
