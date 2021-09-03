/*
 * Program : 4 
swap 2 numbers without using 3rd variable
 */
package mayur.Assignment_26;

public class Swap2Number {
	static int a = 10;
	static int b = 20;

	static void swap2Number() {
		System.out.println("Before swapping two number a="+a+  " and b=" +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping two number a="+a+ " and b=" +b);
	}

	public static void main(String[] args) {
		//Swap2Number swap2Number = new Swap2Number();
		//swap2Number.swap2Number();
		Swap2Number.swap2Number();

	}

}
