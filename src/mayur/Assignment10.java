package mayur;

public class Assignment10{
	int countOfPrimeNum;
	int sumOfPrimeNum;
	int avgOfPrimeNum;
	
	void verifyIsPrimeNumber(int num){
		boolean status = true;
		for(int index=2; index<num ; index++){
			if(num%index==0){
				status = false;
				break;
			}
		}
		if(status){
			System.out.println(num+ " is prime number");
			countOfPrimeNum++;
			sumOfPrimeNum += num;
		}
	}
	void printPrimeNumberRange(int startNum, int endNum){
	
		for(int index = startNum; index<=endNum; index++){
			verifyIsPrimeNumber(index);
		}
		
	}
	void totalCountPrimeNum(int startNum, int endNum){
		for(int index=startNum;index<=endNum;index++){
			verifyIsPrimeNumber(index);
		}
		
		System.out.println("Total count of prime number between range "+startNum +" and "+endNum+ " is " +countOfPrimeNum);	
	}
	void totalSumOfPrimeNum(int startNum, int endNum){
		for(int index=startNum;index<=endNum;index++){
			verifyIsPrimeNumber(index);
		}
		System.out.println("Sum of prime number between range "+startNum +" and "+endNum+ " is " +sumOfPrimeNum);
	}
	void averageOfPrimeNum(int startNum, int endNum){
		for(int index=startNum;index<=endNum;index++){
			verifyIsPrimeNumber(index);
		}
		
		avgOfPrimeNum = sumOfPrimeNum / countOfPrimeNum;
		System.out.println("Average of Prime Number between range "+startNum+" and "+endNum+" is "+avgOfPrimeNum);
	}
	public static void main(String[] args){
		Assignment10 assignment10 = new Assignment10();
		assignment10.verifyIsPrimeNumber(17);
		assignment10.verifyIsPrimeNumber(24);
		System.out.println("----------------");
		Assignment10 assignment10_1 = new Assignment10();
		assignment10_1.printPrimeNumberRange(100,120);
		System.out.println("----------------");
		Assignment10 assignment10_2 = new Assignment10();
		assignment10_2.totalCountPrimeNum(100,120);
		System.out.println("----------------");
		Assignment10 assignment10_3 = new Assignment10();
		assignment10_3.totalSumOfPrimeNum(100,120);
		System.out.println("----------------");
		Assignment10 assignment10_4 = new Assignment10();
		assignment10_4.averageOfPrimeNum(100,120);
	}
}