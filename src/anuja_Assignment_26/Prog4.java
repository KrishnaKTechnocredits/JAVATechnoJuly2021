package anuja_Assignment_26;

public class Prog4 {
	
	void swapWithout3rd(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		Prog4 prog4=new Prog4();
		int a=10;
		int b=20;
		prog4.swapWithout3rd(a,b);

	}

}
