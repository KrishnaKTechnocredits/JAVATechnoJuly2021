package harshada.Assignment_29;

public class P3_FindPalindromeNumber {
	
	boolean getPalindromeNumber(int num ) {
		
		int remainder=0;
		int num1=num;
		
		while(num1 > 0) {
			remainder=remainder*10 + num1 % 10; // 0+1=1 --> 1*10+2=12 --> 120+1=121
			num1=num1/10; //121/10=12, 12/10=1
		}
		if(num==remainder)
			return true;
		else
			return false;
	}
	
	void displayResult(int num) {
		if(getPalindromeNumber(num)) {
			System.out.println("Positive Result : "+ num+" Number is Palindrome ");
		}
			else
				System.out.println("Negative Result : "+ num+" Number is not Palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3_FindPalindromeNumber p3=new P3_FindPalindromeNumber();
		p3.displayResult(121);
		p3.displayResult(15151);
		p3.displayResult(1231);
		p3.displayResult(45899854);//even digit
		p3.displayResult(4589854);//odds digit
	}

}
