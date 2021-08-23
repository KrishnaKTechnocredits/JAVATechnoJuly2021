package sagar_Anasane;

public class NPrimeNumber {
	static int count;
	
	void verifyNumberIsPrime(int num){
		Boolean status = true;
		int index = 2;
		while(index<num) {
			if(num%2==0) {
				status = false;
				count++;
				break;
			}
		index ++;	
		}
		if(status) {
			System.out.println(num);
		}
		
	}
	
	void nPrimeNumber(int num) {
		for (int nIndex=2;nIndex<=num;nIndex++) {
		verifyNumberIsPrime(num);
		count++;
		}
	}
	
	
	public static void main(String[] args) {
		NPrimeNumber nPrimeNumber = new NPrimeNumber();
		nPrimeNumber.nPrimeNumber(11);
		//nPrimeNumber.verifyNumberIsPrime(11);
		
	}
}
