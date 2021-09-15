package chandani.Assignment_26;

public class Assignment26d{

 void swapDigitsUsingTemp(int digit1, int digit2){
		digit1 = digit1 + digit2;
		digit2 = digit1 - digit2;
		digit1 = digit1 - digit2;
		System.out.println("Swapped numbers are : digit 1 is " + digit1 + " and digit 2 is : " + digit2);
		}

	public static void main(String[] args){
		Assignment26d assignment26d = new Assignment26d();
		assignment26d.swapDigitsUsingTemp(1, 66);
	}
}
