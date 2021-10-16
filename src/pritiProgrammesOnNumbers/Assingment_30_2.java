package pritiProgrammesOnNumbers;

public class Assingment_30_2 {
	
	boolean isAmstrong(int number) {
		int num=number;
		int sum=0;
		while(num>0) {
		int digit= num%10;
		sum= sum+(digit*digit*digit);
		num=num/10;
		}
		if(sum == number) 
			return true;
		else
			return false;
			
		
	}
	
	void displayResult(int num){
		if (isAmstrong(num)){
			System.out.println(num+": Number is Amstrong");
		}else
			System.out.println(num+": Number is not Amstrong");
		
	}
	public static void main(String[] a) {
		Assingment_30_2 assingment_30_2 = new Assingment_30_2();
		int num= 153;
		assingment_30_2.displayResult(num);
		int num1= 123;
		assingment_30_2.displayResult(num1);
		int num2= 371;
		assingment_30_2.displayResult(num2);
	}
	

}
/*Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number

Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3*3 + 73 + 1*3 = 371.
*/