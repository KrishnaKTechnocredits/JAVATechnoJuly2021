package kumar_Ashish;

class PrintBy5{

	void no_print_by_5 (int start_no, int end_no){
		
		System.out.println("Divisible by 5, numbers are: ");
		for (int number = start_no; number<=end_no; number++){
			
			if(number%5 ==0)
				System.out.println(number);
				
		
		}
	
	
	
	}
	
	public static void main(String[] args){
		PrintBy5 printBy5 = new PrintBy5();
		printBy5.no_print_by_5(10,30);
		
	
	}




}