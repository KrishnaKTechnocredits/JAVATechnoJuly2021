// Print numbers from 1 to 100
package arti_K;

public class ForloopExample2 {
	
	void printNumbers(int num) {
		for( ;num<=100;num++) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		ForloopExample2  forloopexample2 = new ForloopExample2();
		int num = 1;
		forloopexample2.printNumbers(num);
	}
}
