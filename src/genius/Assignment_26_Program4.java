package genius;

public class Assignment_26_Program4 {

	void swapNumWith3rdVariable(int a, int b) {
		int c =0;
		 c = b;
		 b = a;
		 a = c;
		 
		 System.out.println("numbers after swapping with using 3rd variable: "+ "a="+a +" "+ "b="+b);
	}

	public static void main(String[] args) {
		Assignment_26_Program4 assignment_26_Program4 = new Assignment_26_Program4();
		assignment_26_Program4.swapNumWith3rdVariable(10, 20);
	}
}
