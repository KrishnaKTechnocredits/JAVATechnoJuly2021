package shraddha.LoopExamples;

public class TestWhileLoop {
	
	public static void main(String[] args) {
		TestWhileLoop test = new TestWhileLoop();
		test.primeCount(12);
		test.findNumbersForSum(100);
	}
	
	void primeCount(int n){
		int count=0;
		int num=2;
		System.out.println("First "+n+" Prime Numbers are as below:");
		while(count!=n){
			boolean flag=true;
			int index=2;
			while(index<num){
				if(num%index==0){
					flag=false;
					break;
					}	
			index++;
			}
			if(flag){
				System.out.println(num);
				count++;
			}
		num++;	
		}
	}
	
	void findNumbersForSum(int n){
		System.out.println("---------------------------------");
		int count=0;
		int sum=0;
		int num=1;
		while(sum<n){
			sum=sum+num;
			num++;
			count++;
			System.out.print(count+"+");
		}
		System.out.println(" = "+sum);
		System.out.println("---------------------------------");
		System.out.println("Required number count to generate sum more than "+n+" is " +count);
		System.out.println("---------------------------------");
	}

}
