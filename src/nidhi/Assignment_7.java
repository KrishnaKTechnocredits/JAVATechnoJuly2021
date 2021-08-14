package nidhi;

class Assignment_7{

	void even_number(int startIndex, int endIndex){
		System.out.println("Even numbers are: ");
		for(int i = startIndex; i <= endIndex; i++){
			if ( i % 2 != 0){
				//System.out.println(i);
			}else{
				System.out.println(i);
			}
		}
	}
	
	void divisible_5(int startIndex, int endIndex){
		System.out.println("Divisible by 5, numbers are: ");
		for(int i = startIndex; i <= endIndex; i++){
			if ( i % 5 != 0){
				//System.out.println(i);
			}else{
				System.out.println(i);
			}
		}
	}
	
	void divisible_5and3(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int i = startIndex; i <= endIndex; i++){
			if ( i % 5 != 0 || i % 3 != 0 ){
				//System.out.println(i);
			}else{
				System.out.println(i);
			}
		}
	}
	
	void divisible_7and13(int startIndex, int endIndex){
		System.out.println("Divisible by 7 & 13, numbers are: ");
		for(int i = startIndex; i <= endIndex; i++){
			if ( i % 7 != 0 ){
				//System.out.println(i);
			}else{
				System.out.println(i + " is divisible by 7");
			}
			if ( i % 13 != 0 ){
				//System.out.println(i);
			}else{
				System.out.println(i + " is divisible by 13");
			}
		}
	}
	
	void sum_number(int startIndex, int endIndex){
		int sum = 0;
		for(int i = startIndex; i <= endIndex; i++){
		sum = sum + i;
		}
		System.out.println("Sum is " + sum);
	}
	
	void even_odd_diffnumber(int startIndex, int endIndex){
		int even_sum = 0;
		int odd_sum = 0;
		for(int i = startIndex; i <= endIndex; i++){
			if ( i % 2 != 0){
				odd_sum = odd_sum + i;
			}else{
				even_sum = even_sum + i;
			}
		}
		System.out.println("Difference between even and odd numbers is: " + (odd_sum - even_sum));	
	}
	
	void reverse_oddNbr(int startIndex, int endIndex){
		System.out.println("Odd Numbers in reverse : ");
		for(int i = endIndex; i >= startIndex; i--){
			if ( i % 2 != 0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment_7 assignment7 = new Assignment_7();
		assignment7.even_number(1,20);
		assignment7.divisible_5(1,20);
		assignment7.divisible_5and3(1,20);
		assignment7.divisible_7and13(1,20);
		assignment7.sum_number(1,5);
		assignment7.even_odd_diffnumber(3,9);
		assignment7.reverse_oddNbr(1,20);
	}
	
}