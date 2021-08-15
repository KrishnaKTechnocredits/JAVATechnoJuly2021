package akanksha_K;

public class Assignment11 {
	
	//program 1
	boolean isPrimeNumber(int num) {
		boolean status= true;
		int index=2;
		while (index<num) {
			if(index%2==0) {
				status = false;
				index++;
				break;
			}	
		}
		return status;		
	}
	
	void primeNumberRange(int startnum, int endnum) {
		int num=startnum;
		while ( num<=endnum) {
			if(isPrimeNumber(num)) {
				System.out.println(num+" is a prime number");			
			}
			else {
				System.out.println(num +" is not a prime number");
			}
			num++;
	     }
		System.out.println("");
	}
	
	//program 2
	void sum() {
		int num =0;
		int sum=0;
		while(true) {
			sum = sum + num;
			if(sum<=100) {
				num++;
			}
			else {
				break;
			}	
		}
		System.out.println("Numbers required " + num);	
	 }
		
	public static void  main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.primeNumberRange(1,10);
		assignment11.sum();
	}
}
