package priti;

class Assingment_11{
	
	void printFirstNPrimeNum(int num){
		System.out.println("------------------------------------------");
		int number =1;
		int primeCnt=0;
		while(primeCnt!=num){
			boolean status = true;
			for (int index =2;index<number;index++){
				if (number%index==0){
				status = false;
				//System.out.println(number + "is not a prime number");
				number++;
				break;
				}
			}
				if (status){
				System.out.println(number + "number is prime number");
				primeCnt++;
				number++;
				}	
		}System.out.println("------------------------------------------");
		System.out.println("Total prime numbers= "+ primeCnt );
		
	}
	
	void numCal(){
		int num = 1;
		int sum = 0;
		int numCnt=0;
		while(sum<=100){
			sum = sum+num;
			num= num+1;
			numCnt = numCnt+1;
			System.out.println("Number is-" +numCnt);
			
		}
		System.out.println("------------------------------------------");
		System.out.println("Sum of the number is- "+ sum);
		System.out.println("Number count required to make sum 1000 are - "+ numCnt);
	}
			
	public static void main(String[] a){
		Assingment_11 assingment_11 = new Assingment_11();
		assingment_11.printFirstNPrimeNum(10);
		System.out.println("------------------------------------------");
		assingment_11.numCal();
	}
}