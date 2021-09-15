package indrani;

public class Assignment_30_program4 {
	
	boolean isPerfectNumber(int num) {
		
		int number=num;
		int sum=0;
		for(int index=1; index<num; index++) {
			if(num%index==0)
				sum += index;
		}
		if(number == sum)
			return true;
		else
			return false;
	}
	
	void displayPerfectNumber(int number) {
		
		if(isPerfectNumber(number))
			System.out.println(number + " is perfect number");
		else
			System.out.println(number + " is not perfect number");
	}
	
	public static void main(String[] args) {
		Assignment_30_program4 program4 = new Assignment_30_program4();
		int num1 = 28;
		program4.displayPerfectNumber(num1);
		int num2 = 50;
		program4.displayPerfectNumber(num2);
	}
}
