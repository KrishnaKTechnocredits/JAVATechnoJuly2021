package margi.Assignment_30;

public class Assignment_30_4 {

	//number is a perfect number or not
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
	
	void displayResult(int number) {
		if(isPerfectNumber(number))
			System.out.println(number + " is perfect number");
		else
			System.out.println(number + " is not perfect number");
	}
	
	public static void main(String[] args) {
		Assignment_30_4 assignment_30_4 = new Assignment_30_4();
		int num = 28;
		assignment_30_4.displayResult(num);
	}
}
