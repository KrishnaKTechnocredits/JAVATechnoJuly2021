package jagrati;

public class WhileLoop {
	
	void  findPrimeNumber(int index) {
		int number=2;
		boolean status= true;
		
		while (number<index) {
			
			if(index % number == 0) {
				status = false;
				System.out.println("Is not prime number " + index);
				break;
			}number++;
			
		}if (status == true) {
			System.out.println("number is prime "+ index );
			
		}
	}
	
	
	public static void main(String[] arg){
		WhileLoop wp = new WhileLoop();
		wp.findPrimeNumber(11);
		
	}

}
