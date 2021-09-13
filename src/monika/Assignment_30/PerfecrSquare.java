package monika.Assignment_30;

public class PerfecrSquare {

	boolean isperfectSquare(int number) {
		boolean flag=false;
		for(int index=1;index<=number/2;index++) {
			
			if(index*index==number)
				flag= true;
		}
		return flag;
		
	}
	
	void displayResult(int num) {
		if(isperfectSquare(num))
			System.out.println(num+" is perfect square");
		else
			System.out.println(num+" is not perfect square");
	}
	
	public static void main(String[] args) {
		PerfecrSquare perfcetNo=new PerfecrSquare();
		perfcetNo.displayResult(25);
		
	}
}
