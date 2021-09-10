package dattaraj;

public class Assignment30_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30_P2 assign_p2 = new Assignment30_P2();
		assign_p2.reverseNumber(1932);
	}

	void reverseNumber(int num) {
		// TODO Auto-generated method stub
		int rev=0;
		while(num != 0)   {  
			int remainder = num % 10;  
			rev = rev * 10 + remainder;  
			num = num/10; 
		}  
		System.out.println("The reverse of the given number is: " + rev);  
	}

}
