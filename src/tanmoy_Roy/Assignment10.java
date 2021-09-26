package tanmoy_Roy;

public class Assignment10 {
	
	boolean isPrime(int number) {
		boolean flag=true;
		for(int i=2;i<=(number/2);i++) 
			if(number%i==0) {
				flag=false;
				break;
			}
		if(flag==true)
			return true;
		else
		return false;
				
	}
	
	void PrimesInGivenRange(int lowerLimit,int upperLimit) {
		int count = 0,sum=0;
		double avg;
		System.out.print("All Primes in Range "+lowerLimit+" and "+upperLimit+" are :");
		for (int i=lowerLimit;i<=upperLimit;i++) 
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
				sum+=i;
			}
			
		avg=sum/count;
		
		System.out.println("\nCount of Primes in Range "+lowerLimit+" and "+upperLimit+" is : "+count);
		System.out.println("Sum of Primes in Range "+lowerLimit+" and "+upperLimit+" is : "+sum);
		System.out.println("Avrage of Primes in Range "+lowerLimit+" and "+upperLimit+" is : "+avg);
	
	}
	
	public static void main(String[] args){
		Assignment10 primes = new Assignment10();
		
		if(primes.isPrime(17))
			System.out.println("17 is Prime");
		else
			System.out.println("17 is not Prime");
		
		if(primes.isPrime(16))
			System.out.println("16 is Prime");
		else
			System.out.println("16 is not Prime");
		
		
		primes.PrimesInGivenRange(100,120);
		
	}
}
