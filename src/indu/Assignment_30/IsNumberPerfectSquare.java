package indu.Assignment_30;

public class IsNumberPerfectSquare {

	void isPerfectSquare(int num)
	{
		int index=1;
		int square =0;
		
		while(num>index)
		{
			if(num%index==0)
				square=index;
			index++;
		}
		
		if(square*square==num)
			System.out.println(num+" is perfect square");
		else
			System.out.println(num+" is not perfect square");
	}
	
	public static void main(String[] args) {
		IsNumberPerfectSquare isNumberPerfectSquare = new IsNumberPerfectSquare();
		isNumberPerfectSquare.isPerfectSquare(25);
		isNumberPerfectSquare.isPerfectSquare(255);
		isNumberPerfectSquare.isPerfectSquare(41);
		isNumberPerfectSquare.isPerfectSquare(49);
	}
}
