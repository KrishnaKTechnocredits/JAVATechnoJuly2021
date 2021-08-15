package ankita;

public class Primewhile {
	
	int number=1,index,sum=0;
	
	boolean isPrime(int number)
	{
		boolean status=true;
		index=2;
		while(index<number) {
			if(number%2==0) {
				status=false;
				//System.out.println("no.is not prime"+ number);
			}
			break;
			}
				index++;
		
			if(status==true) {
			
				System.out.println(number +" no is prime");
			}
		return status;
	}
	
	public void printPrime(int input) 
	{
		int begin=1;
		int start=2;
		while (begin<=input) {
			
			if(isPrime(start)==true) {
			begin++;
			start++;
			}else 
			{
				start++;
			}
			
		}
	}
			void sumMoreThan(int num) {
				int strt=0;
				while(num>=sum ) {
					strt=strt+1;
					sum=sum+strt;
				}
				System.out.println("No required for sum 100 is "+strt);
			}
        public static void main(String[] args) {
			Primewhile primewhile= new Primewhile();
			primewhile.isPrime(11);
			primewhile.sumMoreThan(100);
			primewhile.printPrime(10);
		
		}

     }
		
	
		
	

