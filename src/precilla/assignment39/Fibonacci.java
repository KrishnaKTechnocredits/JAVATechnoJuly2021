package precilla.assignment39;

public class Fibonacci {
	void fibonacci(int n) {
		int num1=0,num2=1;
		int sum=num1+num2;
		System.out.println("n - > " + n);
		System.out.print("Output : "+num1+" , "+num2+" , ");
		for(int index=1;index<=n-2;index++) {
			if(index<=n-3) {
				sum=num1+num2;
				num1=num2;
				num2=sum;
				System.out.print(sum+" , ");
			}
			if(index==n-2) {
				sum=num1+num2;
				System.out.println(sum);
			}
		
		}
	}
	public static void main(String[] args) {
		System.out.println("Print first N elements of the Fibonacci series");
		new Fibonacci().fibonacci(8);
	}
}
