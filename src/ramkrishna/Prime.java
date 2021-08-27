package ramkrishna;

public class Prime {
  
	
	 int countPositive (int [] number) {
		 
		 int count1 =0;
				for (int index =0; index<number.length; index++) {
					if(number[index]>0) {
						count1 ++;
						System.out.println(count1);
					}
				} return count1;
	 }
		
	
	int [] getNumber (int num) {
			// int count =0;
			 int [] output = new int [5];
			 for (int index=0; index <5; index++) {
				 num--;
				 output [index] =num;
				 System.out.println(output[index]);
			 } return output;
			
			
		 } 
		 

	
	 int getZeroNumber (int [] num) {
		int count =0;
				 for (int index=0; index< num.length; index++) {
					if(num[index]== 0) {
						count++;
					}
					
				 } return count;
	 }
		 public static void main(String[] args) {
		    
		 Prime prime =  new Prime();
		 prime.getNumber(50);	
	   // prime.countPositive();
	    // System.out.println(prime.getNumber(50));
		 System.out.println("ZeroNumber");
		 int [] num= {1,-11,0,0,55,0,-23,0};
		 System.out.println(prime.getZeroNumber(num));
		 
		 System.out.println("Positive number");
	     int [] positive = {1,-11,-44,23,55,-99,-23,-22};
	     System.out.println("Positive Number : "+ prime.countPositive(positive));
	 } 
	
}
