package chandani.Assignment_39;

public class Assignment39 {
	
	void getFibonacciSeries(int n) {
		 
		 int num1 = 0;
		 int num2 = 1;
		 int sum = 0;
		 System.out.print(num1 + ",");
		 System.out.print(num2 + ",");
		 
		for(int index = 0; index < n - 2;index++) {
			
			 sum = num1+num2;
			 System.out.print(sum + ",");
			 num1 = num2;
			 num2 = sum;	
		}	 
	}
	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.getFibonacciSeries(20);
	}
}
