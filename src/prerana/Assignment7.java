package prerana;

public class Assignment7 {
	
	
	void eveNo() {
		for(int num=10;num<=15;num++) {
			
			if(num%2==0) {
				
				System.out.println("Even numbers shows: "+num );
			}
		}
	
	}
	
	void divBy5() {
		System.out.println("---------------");
		
		
		for(int num=10;num<=30;num++) {
			
			if(num%5==0) {
				
				System.out.println("Number divisible by 5 :" +num);
			}
		}
		
	}
	
	void divBy5and3() {
		System.out.println("---------------");
		
		for(int num=5;num<=18;num++) {
			
			if(num%5==0 && num%3==0) {
				
				System.out.println("Number divisible by 5 and 3 :" +num);
			}
		}
	}
	
	void divBy7and13(int sIndex,int eIndex) {
		System.out.println("---------------");
		
		
		for(int num = sIndex;num<= eIndex ;num++) {
			
			if(num%7==0) {
				
				System.out.println("Number divisible by 7 :" +num);
			}
			else if(num%13==0) {
				
				System.out.println("Number divisible by 13 :" +num);
			}
		}
		
	}
	
	
	void sum() {
		System.out.println("---------------");
		
		int sum=0;
		
		for(int num=1;num<=5;num++) {
			
		sum=sum+num;
		}
		System.out.println("sum of number is :" +sum);
		
	}
	
	void diff(int sIndex,int eIndex) {
		System.out.println("---------------");
		
		int odd =0;
		int eve =0;
		int d;
		
		for(int num = sIndex;num<= eIndex ;num++) {
			
			if(num%2!=0) {
				
				odd=odd+num;
				
			}
			
			else if(num %2==0) {
				
				eve=eve+num;
			}
		}
		
		d=odd-eve;
		
		System.out.println("Difference is: " +d);
	}
	
	void reverseOdd(int sIndex,int eIndex) {
		System.out.println("---------------");
		
		for(int num = sIndex;num>= eIndex ;num--) {

			if(num%2!=0) {
				
				System.out.println("Revers order  is: " +num);
			}
		}
			
	}
	public static void main(String[] a) {
		
		Assignment7 a1=new Assignment7();
		
		
		a1.eveNo();
		a1.divBy5();
		a1.divBy5and3();
		a1.divBy7and13(5, 40);
		a1.sum();
		a1.diff(3, 9);
		a1.reverseOdd(20,10);
		
		
		
	}
	
	

}
