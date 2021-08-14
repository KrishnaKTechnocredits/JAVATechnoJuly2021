package ritabrata;

public class Assignment11 {
	
	boolean checkPrime(int number) {
		boolean flag=true;
		for(int index=2;index<number; index++) {
			if(number%index==0) {
				flag=false;
				break;
			}
		}
		return flag;	
	}

	void checkRange(int range) {
		int countPrime=0;
		int number=2;
		System.out.println("First "+range+" Prime numbers are: ");
		while(countPrime<range) {
			if(checkPrime(number)) {
				System.out.print(number+ ", ");
				countPrime++;
			}
			number++;
		}			
	}
	
	void add(int sumRange) {
		int sum=0;
		int num=1;
		int count=0;
		while(sum<=sumRange) {
			sum=sum+num;
			num=num+1;
			count++;
		}
		System.out.println(count);		
	}
	
	public static void main(String[] args) {
		Assignment11 prime= new Assignment11();
		prime.checkRange(10);
		System.out.println("-------------------------------------------");
		prime.add(100);
	}
}
