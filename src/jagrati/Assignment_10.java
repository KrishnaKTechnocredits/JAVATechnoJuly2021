package jagrati;

public class Assignment_10 {
	int count= 0;
	int sum =0;
	float avg;
	
	void numberIsPrimeNumber(int number){
		boolean status = true;
		for (int index = 2; index<number; index++){
			if(number%index == 0){
				status = false;
				//System.out.println("number is not prime " + number );
				break;
			
		    }
		}
		if (status == true) {
			
		System.out.println(number +" Number is prime");
		count++;
		sum = sum + number;
		avg = sum/ count;
		
		}
	}
	void primeNumberBTWrange(int startNumber, int endNumber){
		for (int number =startNumber; number<=endNumber; number++){
			numberIsPrimeNumber(number);
		}
	} void dispayTotalCountOfPrimeNumber() {
		System.out.println("------ Total Count--------- ");
		System.out.println("Total prime number count is-> "+ count );
		
	} void dispayTotalSumOfPrimeNumber() {
		System.out.println("------ Total Sum--------- ");
		System.out.println("Total sum of all prime number-> " + sum );
		
	}void displayAvgPrimeNumber(){
		System.out.println("------ Total Avg--------- ");
		System.out.println("Total average of prime number-> " + avg);
	}
	
	
	
	public static void main(String []aa){
		Assignment_10 assignment_10 = new Assignment_10();
		System.out.println("Please find below prime number between range 100 to 120 ");
		assignment_10.primeNumberBTWrange(100, 120);
		assignment_10.dispayTotalCountOfPrimeNumber();
		assignment_10.dispayTotalSumOfPrimeNumber();
		assignment_10.displayAvgPrimeNumber();
	}

}
