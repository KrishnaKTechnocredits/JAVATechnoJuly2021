package mayur.Assignment_26;

public class Swap2NumberWithVariable {
	
	static void swapnumberwithVariable() {
		int a =30;
		int b =50;
		int t;
		
		System.out.println("Before swapping number a="+a+ " and b="+b);
		t = a + b;
		a = t - a;
		b = t - a;
		
		System.out.println("After swapping number a="+a+ " and b="+b);
	  
	
	}

	public static void main(String[] args) {
		Swap2NumberWithVariable.swapnumberwithVariable();

	}

}
