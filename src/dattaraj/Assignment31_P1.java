package dattaraj;

public class Assignment31_P1 {
	
	public static void main(String[] args) {
		Assignment31_P1 p1 = new Assignment31_P1();
		p1.PerfectNumber(6);
	}

	 void PerfectNumber(int num) {
		// TODO Auto-generated method stub
		long sum=0;  
		
		for(int i=1; i <= num/2; i++)  {  
			if(num % i == 0)  {  
				sum=sum + i;  
			}
		}   
		if(sum==num) {
			System.out.println(num + " is a perfect number.");
		}else {
			System.out.println(num + " is not a perfect number.");
		}
		  
	}
}
