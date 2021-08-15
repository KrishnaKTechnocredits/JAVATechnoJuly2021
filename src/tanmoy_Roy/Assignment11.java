package tanmoy_Roy;
import tanmoy_Roy.Assignment10;

public class Assignment11 {
	
	void printFirstNPrimes(int N) {
		Assignment10 prime= new Assignment10();
		int i=3;
		System.out.print("First "+N+" prime numbers are : 2 ");		//Handling 2 explicitly
		while(i<=N) {												
			if(prime.isPrime(i))									//using the isPrime method previously created
				System.out.print(i+" ");
			i+=2;													//only choosing odd numbers
		}
		System.out.print("\n");	
	}
		
	void minimumNumbersRequired(int N) {
		int i=1;
		while((i*(i+1))/2<N) {				//i*(i*1)/2 = Sum of first i numbers
			i++;
		}
		System.out.println("Sum of first "+i+" Numbers will generate sum greater than "+N);	
	}
	
	public static void main(String[] args){
		Assignment11 whileLoop = new Assignment11();
		whileLoop.printFirstNPrimes(20);
		whileLoop.printFirstNPrimes(10);
		whileLoop.printFirstNPrimes(40);
		whileLoop.minimumNumbersRequired(50);
		whileLoop.minimumNumbersRequired(100);
	}

}
