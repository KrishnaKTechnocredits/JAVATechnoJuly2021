package rushikesh.assign36_39;
/*
 Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
 */
public class Assign39 {
	
	void fibonacci(int num) {
		if(num<=0) {
			System.out.println("Invalid i/p");
		}else if(num==1) {
			System.out.println(1);
		}else if(num>1) {
			int num1=0;
			int num2=1;
			int sum;
			System.out.print(num1+" "+num2);
			for(int i=2;i<num;++i) {	
				sum=num1+num2;
				System.out.print(" "+sum);
				num1=num2;
				num2=sum;		
			
			}
		}		
	}
	public static void main(String[] args) {
		Assign39 assign39= new Assign39();
		assign39.fibonacci(10);
	}
}
