package shreya;
 
public class PrimeNumber {
	int totalCount=0;
	int primeSum=0;
	double average;
	
	
	void printPrimeNumber(int number) {
		boolean status=true;
		for(int index=2;index<number;index++) {
			
			if(number%index==0) {
				status=false;
				System.out.println(number+" is not a prime number");
				break;
		    }
		} if(status) {
			 System.out.println(number+" is a prime number");
			 primeSum=primeSum+number;
			 totalCount=totalCount+1;
			 average=primeSum/totalCount;
			 
			 }
	}
	
	void verifyPrimeNumInRange(int startRange,int endRange) {
		System.out.println("-----To Print All Prime Numbers In Given Range-----");
		for(int number=startRange;number<=endRange;number++) {
			printPrimeNumber(number);
		}
	}
	
	 void displayTotalCount() {
		 System.out.println("-----To Print Total Count Of Prime Numbers In Given Range-----");
		 System.out.println("Total Count is "+totalCount);
	 }
	 
	 void displayPrimeSum() {
		 System.out.println("-----To Print Sum Of All Prime Numbers In Given Range-----");
		 System.out.println("sum is "+primeSum);
	 }
	 
	 void displayAverage() {
		 System.out.println("-----To Print Average Of Prime Numbers In Given Range-----");
		 System.out.println("Average is "+average); 
	 }
	 
	 public static void main(String[] args) {
		PrimeNumber primeNumber=new PrimeNumber();
		System.out.println("-----To Check Whether Number Is Prime Or Not-----");
		primeNumber.printPrimeNumber(8);
		primeNumber.verifyPrimeNumInRange(100, 120);
		primeNumber.displayPrimeSum();
		primeNumber.displayTotalCount();
		primeNumber.displayAverage();
	}

}
