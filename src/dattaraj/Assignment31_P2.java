package dattaraj;

public class Assignment31_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment31_P2 p2 = new Assignment31_P2();
		if (p2.PerfectSquare(25)) {  
			System.out.println("the given number is perfect square.");  
		}else  {
			System.out.print("the given number is not perfect square.");   
		}  
	}

	
	boolean PerfectSquare(int number){   
		for (int i=1; i*i<=number; i++){    
			if((number%i==0) && (number/i==i)){     
				return true;   
			}   
		}   
		return false;   
	}   

}
