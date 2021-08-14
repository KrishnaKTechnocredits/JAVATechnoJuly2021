package swati;
class Assignment10{
	int sum,count,average;
	
	void verfiyNumberIsPrime(int number){
		boolean status=true;
		for(int index=2;index<number;index++){
			if(number%index==0){
				System.out.println(number+" Number is not a prime number");
				status=false;
				break;
			}
		}
			if(status==true){
			System.out.println(number+" Number is a prime number");
			count++;
			sum=sum+number;
			average=sum/count;
			}
	}
	
	void verfiyPrimeInRange(int startRange,int endRange){
		for(int number=startRange;number<=endRange;number++){
			verfiyNumberIsPrime(number);
		}
	}

	void displaySumCountAverage(){
		System.out.println("\nSum of all prime numbers between 100->120: "+sum);
		System.out.println("\nTotal count of all prime numbers between 100->120: "+count);
		System.out.println("\nAverage of prime numbers between 100->120: "+average);
	}
	
	public static void main(String[] a){
		Assignment10 assignment10=new Assignment10();
		assignment10.verfiyPrimeInRange(100,120);
		assignment10.displaySumCountAverage();
	}
				
}	