/*Program : 3 
swap 2 numbers with using 3rd variable*/

package atul_K.Assignments.Ass26;

public class Program3 {
	int num1 = 10;
	int num2 = 20;
	
	
	void swapNum() {
		int num3 = num1;
		num1 = num2;
		num2 = num3;
	}
	
	public static void main(String[] args) {
		Program3 p3 =new Program3();
		p3.swapNum();
		System.out.println("num1:"+p3.num1+", num2: "+p3.num2);
	}
}
