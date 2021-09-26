package ramkrishna;

public class Assignment26d {
	void swapNumbersWithout3rdVariable(int num1,int num2) {

 		System.out.println("Value of Numbers Before Swapping "+num1+" "+num2);

 		num1=num1+num2;
 		num2=num1-num2;
 		num1=num1-num2;

 		System.out.println("Value of Numbers After Swapping: "+num1+" "+num2);
 	}
 	public static void main(String[] args) {
 		Assignment26d assignment26d=new Assignment26d();
 		assignment26d.swapNumbersWithout3rdVariable(100,200);
 	}

}
