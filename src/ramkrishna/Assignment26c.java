package ramkrishna;

public class Assignment26c {
	
	void swapNumbers(int num1,int num2) {
 		System.out.println("Value of Numbers Before Swapping "+num1+" "+num2);

 		int num3=0;
 		num3=num2;
 		num2=num1;
 		num1=num3;
 		System.out.println("Value of Numbers After Swapping: "+num1+" "+num2);
 	}
 	public static void main(String[] args) {
 		Assignment26c assignment26c=new Assignment26c();
 		assignment26c.swapNumbers(50, 100);
 	}

}
