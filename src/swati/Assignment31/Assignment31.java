package swati.Assignment31;

public class Assignment31 {
	
	boolean findPrefectSquare(int num) {
		int temp=(int)Math.sqrt(num);
		if(num==temp*temp) {
			System.out.println(num+" is perfect square number.");
			return true;
		}	
		else {
			System.out.println(num+" is not a perfect square number.");
			return false;
		}
		
	}
	
	boolean findPerfect(int num) {
		int sum=0;
		for(int index=1;index<=num/2;index++) {
			if(num%index==0) {
			sum=sum+index;
			}
		}
		
		if(sum==num) {
			return true;
			//System.out.println(num+" is a perfect number");
		}
		else
			return false;
			//System.out.println(num+" is not a perfect number");
	}
	
	void findPerfectNoInRange(int start,int end) {
		System.out.println("\nperfect numbers in range "+start+"-"+end+" is :");
		boolean flag=false;
		for(int index=start;index<=end;index++) {
		flag=findPerfect(index);
			if(flag) {
				System.out.println(index);
			}
				
		}
		
	}
	
	public static void main(String[] a) {
		Assignment31 a1=new Assignment31();
		 a1.findPrefectSquare(16);
		 a1.findPerfectNoInRange(10,500);
		 int number=28;
		 boolean flag=a1.findPerfect(number);
		 if(flag) {
			 System.out.println("\n"+ number+" is a perfect number.");
		 }
		 else
			 System.out.println("\n"+ number+" is not a perfect number.");
			 
	}
}
