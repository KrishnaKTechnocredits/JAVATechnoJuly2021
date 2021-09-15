package chandani.Assignment_31;

public class Assignment31d {

	


	boolean isPerfectNumber(int num) {
		
		int sum = 0;
		for(int index = 1; index < num ; index++) {
			if(num % index == 0) {
			sum = sum + index;
			}
		}		

			if (sum == num)
				return true;
			else
				return false;
	}
	
	void getPerfectNumberWithinRange(int startnum, int endnum){
		System.out.println("Perfect numbers between " + startnum + " and " + endnum + " is ");
		for(int index = startnum; index < endnum; index++) {
			if(isPerfectNumber(index)) {
				System.out.println(index);
		    }
		}

	}

	public static void main (String[] args){
		Assignment31d assignment31d = new Assignment31d();
		assignment31d.getPerfectNumberWithinRange(40, 720);
		
	} 
}
