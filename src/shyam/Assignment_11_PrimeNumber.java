package shyam;

public class Assignment_11_PrimeNumber {
	void checkPrimeNumber(int num) {
		boolean status = true;
		int index = 2;
		while(index<10) {
			if(num%2==0) {
				status = false;
				break;
				
			}
			index++;
		}
		
		if (status) {
			System.out.println(num + " Is Prime");
		}
		
		
	}
	
	void reqNumberForGeneratingSum(int reqSum){
        int sum=0;
        int number=1;
        while(sum < reqSum){
        sum=sum+number;
        number ++;
	      }
    	System.out.println(" Required number for generating Sum greater than " + reqSum + " is : " +(number-1));

	}
	
	public static void main(String[] args) {
		Assignment_11_PrimeNumber a11 =new Assignment_11_PrimeNumber();
		a11.checkPrimeNumber(3);
		a11.reqNumberForGeneratingSum(100);
	}

}
