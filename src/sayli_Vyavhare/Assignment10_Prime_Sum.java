package sayli_Vyavhare;
public class Assignment10_Prime_Sum {
	int  totalPrime=0,averagePrime=0;
	int countPrime=0;
	
	void primeOrNot(int number) {
		boolean flag=true;
		
		for(int index=2;index<number;index++) {
		    if(number%index==0) {
			    flag=false;
			  //System.out.println("Not prime number");
			    break;
		  }
	 }
		    if(flag) {
		    	System.out.println(number+" is a prime number");
		        countPrime= countPrime+1; 
		        totalPrime=totalPrime+number;
		        averagePrime=totalPrime/countPrime;
		    }
	}
	void printInRange(int startRange,int endRange) {
		 for (int number=startRange;number<=endRange;number++) {
			   primeOrNot(number);
	     }
	}
	public static void main(String[] args) {
		Assignment10_Prime_Sum assignment10_prime_sum=new Assignment10_Prime_Sum();
		assignment10_prime_sum.printInRange(100, 120);
		System.out.println("Count of prime numbers "+assignment10_prime_sum.countPrime);  
		System.out.println("Sum of prime numbers "+assignment10_prime_sum.totalPrime);   
		System.out.println("Average of prime numbers "+assignment10_prime_sum.averagePrime); 	
		System.out.println("-------------------------------------");
		assignment10_prime_sum.primeOrNot(23);
		assignment10_prime_sum.primeOrNot(7);
	}
}