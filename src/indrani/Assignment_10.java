package indrani;

class Assignment_10{

    static int sumOfPrimeNos;
    static int countOfPrimeNos;
  

    void verifyIfNoIsPrime(int number){
    boolean flag = true;
	for(int index=2;index<number;index++){
		if(number%index==0){
			flag=false;
			break;
		}
	}
	     if(flag){
		    System.out.println(number + " is prime number");
		    countOfPrimeNos++;
		    sumOfPrimeNos=sumOfPrimeNos+number;
	    }
	}
	void primeNosInRange(int startIndex,int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
		verifyIfNoIsPrime(num);
		}
		countOfPrimeNumbers();
		sumOfPrimeNumbers();
		averageOfPrimeNumbers();
	}
	void countOfPrimeNumbers(){
		System.out.println();
		System.out.println(" Count of Prime numbers :");
		System.out.println(countOfPrimeNos);
		System.out.println();
	}
	void sumOfPrimeNumbers(){
		System.out.println();
		System.out.println(" Sum of Prime numbers :");
		System.out.println(sumOfPrimeNos);
	}
	void averageOfPrimeNumbers(){
		System.out.println(" Average of Prime numbers :");
		System.out.println(sumOfPrimeNos/countOfPrimeNos);
	}
	public static void main(String[] args){
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.verifyIfNoIsPrime(19);
		assignment_10.primeNosInRange(111,210);
	}
}

	
	