//Program 4 : verify given number is a perfect square.
package monika;

public class Assignment30_Program_4 {
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
		Assignment30_Program_4 perfcetNo=new Assignment30_Program_4();
		perfcetNo.displayResult(25);
	}
}
