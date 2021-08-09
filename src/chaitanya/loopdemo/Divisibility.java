//package chaitanya.loopdemo;

public class Divisibility {
	
	void divisible(int sindex, int eindex) {
	
	for (int index = sindex ; index <= eindex ; index++ ) {
		 
			if (index%3==0 && index%5==0)
				 System.out.println(index + " Divisible by 3 & 5");
			else if (index%3==0)
				System.out.println(index + " Divisible by 3");
	       else if (index%5==0)
	    	   System.out.println(index + " Divisible by 5");
	       else 
	    	   System.out.println(index + " Neither dvisible by 5 nor 3");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisibility divisibility = new Divisibility();
		divisibility.divisible(1,100);
	}

}
