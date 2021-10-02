package nidhi;

/** Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
**/

class Assignment_39{
	
	void fibonacciSeries(int n){
	
		System.out.print(0 + ",");
		System.out.print(1 + ",");	
		int i=0;
		int j=1;
		int k=1;
		while (k<= (n-2)){
			int q = i+j;
			if (k == (n-2))
				System.out.print(q );
			else 
				System.out.print(q + ",");
			i = j;
			j = q;
			
			k++;
		}
		
	}
	
	public static void main(String[] ar){
		Assignment_39 assignment = new Assignment_39();
		assignment.fibonacciSeries(8);
	}

}