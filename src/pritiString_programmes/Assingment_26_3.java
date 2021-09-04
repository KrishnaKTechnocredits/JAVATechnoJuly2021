package pritiString_Programmes;

public class Assingment_26_3 {
	void assingment_26_3(int num1, int num2){
		System.out.println("Numbers before swaping are "+"num1 is :" + num1 + " and num2 is :"+num2);
		int temNumber=num1+num2;
		num1= temNumber-num1;
		num2= temNumber-num2;
		System.out.println("Numbers swaped using 3rd variable"+ " num1 is :" + num1 + " and num2 is :"+num2);
		
	}
	public static void main(String[] a) {
		Assingment_26_3 assingment_26_3 = new Assingment_26_3();
		assingment_26_3.assingment_26_3(30, 20);
	}

}
/*Program : 3 
swap 2 numbers with using 3rd variable
*/