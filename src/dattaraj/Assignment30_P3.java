package dattaraj;

public class Assignment30_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30_P3 assign_p3 = new Assignment30_P3();
		assign_p3.isArmstrong(153);
	}

	void isArmstrong(int n) {
		// TODO Auto-generated method stub
		int temp, digits=0, last=0, sum=0;   
		temp=n; 
		while(temp>0)    {   
			temp = temp/10;   
			digits++;   
		}
		
		temp = n;   
		while(temp>0){   
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));   
			temp = temp/10;   
		}  

		if(n==sum) {
			System.out.println(n + " is a Armstrong Number.");  
		}else {
			System.out.println(n + " is not a Armstrong Number."); 
		}
	}

}
