package rushikesh.assign30;
public class Assign30_3 {
	boolean isPallindrome(int  input) {
		int revNum=0;
		int num;
		num=input;
		while(num>0) {
			int rem=num%10;
			revNum=revNum*10+rem;
			num=num/10;
		}
		if(input==revNum) 
		return true;
	return false;
	}
	
	void displayNumberPallindromeResult(int input) {
	
		if(isPallindrome(input))
			System.out.println(input + " is Pallindrome");
		else
			System.out.println(input + " is not a Pallindrome");
	}
	public static void main(String[] args) {
		Assign30_3 assign30_3=new Assign30_3();
		assign30_3.displayNumberPallindromeResult(12321);
	}
}

