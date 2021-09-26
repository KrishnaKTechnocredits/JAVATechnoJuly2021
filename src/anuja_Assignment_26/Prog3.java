//WAP to swap 2 nos using 3rd variable
package anuja_Assignment_26;

public class Prog3 {
	
	void swapusing3rd(int a,int b) {
		int c=0;
		c=a;//10
		a=b;//20
		b=c;//10
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		Prog3 prog3=new Prog3();
		int a=10;
		int b=20;
		prog3.swapusing3rd(a,b);
		

	}

}
