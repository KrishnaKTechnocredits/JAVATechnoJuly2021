package genius;

public class Assignment_26_Program3 {
	
	
	void swapNumWithout3rdVariable(int a, int b) {
		 a = a+b;
		 b = a-b;
		 a = a - b;
		 
		 System.out.println("numbers after swapping without using 3rd variable: "+ "a="+a +" "+ "b="+b);
	}

	public static void main(String[] args) {
		Assignment_26_Program3 assignment_26_Program3 = new Assignment_26_Program3();
		assignment_26_Program3.swapNumWithout3rdVariable(10, 20);
	}

}
