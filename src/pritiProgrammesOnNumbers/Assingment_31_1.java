package pritiProgrammesOnNumbers;

public class Assingment_31_1 {
	
	boolean isPerfectNumber(int number){
		int sum=0;
		int num= number;
		for(int index=1;index<number;index++) {
			if (number%index==0)
				sum= sum+index;
		}
		if (sum==number)
			return true;
		else
			return false;
		
	}
	void displayResult(int num) {
		if (isPerfectNumber(num))
			System.out.println(num+": is perfect number");
		else
			System.out.println(num+": is not perfect number");
				
	}
	 public static void main(String[] a) {
		 Assingment_31_1 assingment_31_1 = new Assingment_31_1();
		 int num = 6;
		 assingment_31_1.displayResult(num); 
		 int num1 = 50;
		 assingment_31_1.displayResult(num1);
	 }
		
	

}
/*Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number*/
