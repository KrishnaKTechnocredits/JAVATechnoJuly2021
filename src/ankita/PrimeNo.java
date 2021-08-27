package ankita;

public class PrimeNo {
	int number;
	int count=0;
	int sum=0; double avg;
	
	boolean verifyIsPrime(int number) {
		boolean status=true;
		for(int index=2;index<number;index++) {
			if(number%2==0) {
				status=false;
				System.out.println(number + " number is not prime");
				break;	
			}	
		}
		if(status==true) {
			
			System.out.println(number +" number is prime");
			
			}
		return status;
		}
		   
		void rangePrime(int startIndex,int endIndex) {
			
			for(int number=startIndex;number<endIndex;number++) {
				verifyIsPrime(number);
			}
		}
		
		void primeSum(int startIndex,int endIndex) {
			System.out.println(" Again calling verifyIsPrime method in Printsum");
			boolean flag=true;int summ=0; int cnt=0;
			for(int number=startIndex;number<=endIndex;number++) {
				flag=verifyIsPrime(number);
				if(flag==true) 
				{
					summ=summ+number;
					cnt++;
				} 
			}
			System.out.println("Sum is ="+summ);
			sum=summ;
			count=cnt;
		}
		
		
		void primeCount() {
			
			System.out.println("prime no count is "+count);
		
		}
		
		void primeAvg() {
			avg=sum/count;
			System.out.println("Average of prime no is "+ avg);
		}

	public static void main(String[] args) {
		PrimeNo primeno=new PrimeNo();
		primeno.verifyIsPrime(98);
		primeno.rangePrime(100,120);
		primeno.primeSum(100,120);
		primeno.primeCount();
		primeno.primeAvg();
		
		
	}
}
