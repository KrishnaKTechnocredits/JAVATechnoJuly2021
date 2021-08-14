package prerana;

public class Assignment10 {
	int sum;
	int count;
	int avg;
	
	
	
	void primeNo(int n) {
		
		boolean check =true;
		for(int index=2;index < n;index++) {
			if(n%index==0) {
				
				check=false;
				
			}
		}
		if(check) {
			count =count +1;
			sum=sum+n;
			avg=sum/count;
			
		}
		
	}
	
	
	void primenoRange(int s,int e) {
		for(int n=s;n<=e;n++)
			primeNo(n);
	}
	
	void count() {
		System.out.println("Total prime numbers are: "+count);
	}
	
	void sum() {
		System.out.println("Sum of prime numbers are: "+sum);
	}
	
	void avg() {
		System.out.println("average of prime numbers are: "+avg);
		
	}
	
	public static void main(String[] args) {
		Assignment10 a=new Assignment10();
		a.primenoRange(100, 120);
		a.count();
		a.sum();
		a.avg();
	}
		
		
}


