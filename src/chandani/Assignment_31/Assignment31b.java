package chandani.Assignment_31;

public class Assignment31b {

int result = 0;
	
	int getPerfectSquare(int num) {
			int sqrtnum = (int)Math.sqrt(num);//25 ---5
			result = (int)(sqrtnum * sqrtnum);
			return result;
	}

	void displayPerfectSquareOrNot(int num){
		if(num == getPerfectSquare(num)) {
			System.out.println("Given number " + num + " is a perfect square " );
		}else
			System.out.println("Given number " + num + " is not a perfect square " );		
	}
	
	public static void main (String[] args){
		Assignment31b assignment31b = new Assignment31b();
		assignment31b.displayPerfectSquareOrNot(25);
		Assignment31b assignment31b1 = new Assignment31b();
		assignment31b1.displayPerfectSquareOrNot(20);
		Assignment31b assignment31b2 = new Assignment31b();
		assignment31b2.displayPerfectSquareOrNot(100);	
	} 
}
