/*Program : 4 
swap 2 numbers without using 3rd variable*/

package shraddha.Assignment26;

public class NumberSwapWithoutVariable {
	public static void main(String[] args) {	
	int x = 6;
	int y = 14;
	System.out.println("Initially Value of 1st Variable is :- "+x);
	System.out.println("Initially Value of 2nd Variable is :- "+y);
	//swapping the value of variables
	x=x+y;
	y = x-y;
	x = x-y;
	System.out.println("--------------------------------------------");
	System.out.println("After Swapping, Value of 1st variable will be :- " + x);
	System.out.println("After Swapping, Value of 2nd variable will be :- " + y);
	}
}
