package sayli_Vyavhare;

public class Assignment11_Prime {
	int sum;
	int count;
	int primecount;
	void sumOfRange() {
		int num=1;
	    do {
			sum=sum+num;
			num++;
			count++;
		} while(sum<100);

		System.out.println("Required number to find sum is:"+count);
	}
	
	void primeNumbers(int num) {
		boolean status=true;
		int index=2;		
		while(index<num) {
			  if(num%index==0) {
				  status=false;
			      break;
			 }
	       	 index++;
		} if(status) {
		   System.out.println(num+" is prime number");
	       primecount++;
		}	
    }
	
	void getPrimeNumbers(int givenRange) {
		int index =1;
		while(primecount<givenRange) {
			primeNumbers(index);
			index++;
		}
	}	
	public static void main(String[] args) {
		
		Assignment11_Prime assignment11prime= new Assignment11_Prime();
		assignment11prime.getPrimeNumbers(10);
		assignment11prime.sumOfRange();
	}
}
