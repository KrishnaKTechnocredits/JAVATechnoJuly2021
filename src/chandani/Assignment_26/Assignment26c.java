package chandani.Assignment_26;

public class Assignment26c{

 void swapDigitsUsingTemp(int digit1, int digit2){
		int temp = 0;
		temp  = digit1;
		digit1 = digit2;
		digit2 = temp;
		System.out.println("Swapped numbers are : digit 1 is " + digit1 + " and digit 2 is : " + digit2);
		}
	
	public static void main(String[] args){
		Assignment26c assignment26c = new Assignment26c();
		assignment26c.swapDigitsUsingTemp(8, 9);
	}
}
