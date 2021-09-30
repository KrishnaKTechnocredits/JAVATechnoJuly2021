/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */


package ritabrata2;

public class Assignment39 {
	void getFiboSeries(int limit) {
		int first=0, next=1;
		System.out.print("Fibonacci series for first "+limit+" numbers are: "+first+ ", "+next+", ");
		for(int i=1; i<=limit-2;++i) {
			int sum= first+next;
			first=next;
			next=sum;
			System.out.print(sum+", ");	
		}
	}

	public static void main(String[] args) {
		Assignment39 fibonacci= new Assignment39();
		fibonacci.getFiboSeries(8);

	}

}
