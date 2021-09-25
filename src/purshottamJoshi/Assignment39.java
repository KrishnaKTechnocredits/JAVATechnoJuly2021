/*Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13*/
package purshottamJoshi;
class Assignment39{
	
	void getFibonacci(int num){
		int num1=0,num2=1;
		int sum=0;
		
		for(int index=0; index < num; index++){
			num1=num2;
			num2=sum;
			sum=num1+num2;
			System.out.println(num2);
		}
	
	}
	
	public static void main(String[] args){
		new Assignment39().getFibonacci(9);
		
	}
}