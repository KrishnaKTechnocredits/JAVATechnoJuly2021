package elizabeth;

class Assignment10{
	
	int count;
	int sum;
	
	void verifyPrimeNumber(int num){
		boolean flag=true;
		for(int index=2;index<num;index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}
		if(flag){
			count++;
			System.out.println(num + " is prime");
			sum=sum+num;
		}	
	}
	
	void verifyPrimeInRange(int startNum,int endNum){
		for(int num=startNum;num<=endNum;num++){
			verifyPrimeNumber(num);
		}
	}
	void countPrimeNumbers(){
		System.out.println("Total count of the prime numbers within the given range is " + count);
	}

	void sumOFPrimeNumbers(){
		System.out.println("Sum of the prime numbers within the given range is " +sum);
	}
	void averageOfPrimeNumbers(){
		int average=sum/count;
		System.out.println("Average of the prime numbers within the given range is " +average);
	}
	
	public static void main(String[]args){
		Assignment10 assignment10=new Assignment10();
		assignment10.verifyPrimeInRange(100,120);
		assignment10.countPrimeNumbers();
		assignment10.sumOFPrimeNumbers();
		assignment10.averageOfPrimeNumbers();
		
	}
}
