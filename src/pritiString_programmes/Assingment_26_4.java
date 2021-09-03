package pritiString_Programmes;

public class Assingment_26_4 {
	void swapNumberswithout3rdvar(int num1, int num2) {
		System.out.println("Numbers before swaping are "+"num1 is :" + num1 + " and num2 is :"+num2);
		num1=num1+num2;
		num2= num1-num2;
		num1= num1-num2;
		System.out.println("Numbers swaped without 3rd variable"+ " num1 is :" + num1 + " and num2 is :"+num2);
		
	}
	public static void main(String[] a) {
		Assingment_26_4 assingment_26_4 =new Assingment_26_4();
		assingment_26_4.swapNumberswithout3rdvar(30, 20);
		
		
	}
}
/*Program : 4 
swap 2 numbers without using 3rd variable*/
