/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
*/
package bhakti;

public class Assignment_39_Fibonacci {
	void getFibonacciseries(int n) {
		int num1=0, num2=1, count=2;
		 
		System.out.print(num1 +" ");
		System.out.print(num2+" ");
		while (count<n) {
			int num3= num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			count++;
		}
		
	}
	public static void main(String[] args) {
		Assignment_39_Fibonacci a1= new Assignment_39_Fibonacci();
		a1.getFibonacciseries(7);
	}
}
