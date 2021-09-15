/*Program : 3 
swap 2 numbers with using 3rd variable*/

package shraddha.Assignment26;

public class SwapNumberUsingVariable {
	public static void main(String[] args) {
		int x = 25;
		int y = 48;
		System.out.println("Initially Value of 1st Variable is :- " + x);
		System.out.println("Initially Value of 2nd Variable is :- " + y);
		// swapping the value of variables using a temporary variable
		int temp = x;
		x = y;
		y = temp;
		System.out.println("--------------------------------------------");
		System.out.println("After Swapping, Value of 1st variable will be :- " + x);
		System.out.println("After Swapping, Value of 2nd variable will be :- " + y);
	}
}
