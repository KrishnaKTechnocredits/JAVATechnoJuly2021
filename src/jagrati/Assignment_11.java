package jagrati;

public class Assignment_11 {
	int printCount=2 ;
	boolean findPrimeNumber(int printCount) {
		boolean status= true;
		for (int index =2; index<printCount ; index++) {
			if (printCount % index == 0) {
				//System.out.println(printCount +" is not prime number ");
				status = false;
				break;
				
			}
			
		}
		if (status){
			System.out.println(printCount  + " number is prime ");
			
	        } 
		return status;
	} void printRange(int range) {
		for (int index =1; index<range ; index++) {
			findPrimeNumber(printCount);
			printCount++;
			//System.out.println("print range "+ printCount);
		}
		
		
	}
	void sumMoreThan100(){
		int sum = 0; 
		int number =1;
		int numberCount=0;
		 while (sum < 100) {
			 sum = sum + number;
			 number++;
			 numberCount++;	 
			 
		 } System.out.println(numberCount +" numbers required to generate sum more than 100 ");
		
	}
	public static void main(String [] aa) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printRange(10);
		assignment_11.sumMoreThan100();
		
	}

}
