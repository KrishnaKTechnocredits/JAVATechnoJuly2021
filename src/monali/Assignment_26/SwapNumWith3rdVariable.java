package monali.Assignment_26;

/*Program : 3 
swap 2 numbers with using 3rd variable*/

public class SwapNumWith3rdVariable {

	void swapNumWith3rdVariable(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapping numbers values : " + a + " " + b);

	}

	public static void main(String[] args) {
		new SwapNumWith3rdVariable().swapNumWith3rdVariable(10, 20);
	}
}
