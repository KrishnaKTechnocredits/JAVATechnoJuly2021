package dattaraj;

public class Assignmet26_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmet26_P4 p4 = new Assignmet26_P4();
		p4.swapNum(6,17);
	}

	void swapNum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Number a : "+a+"\nNumber b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : \na : "+a+"\nb : "+b);
	}

}
