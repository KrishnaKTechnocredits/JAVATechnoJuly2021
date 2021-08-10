package chirag.loopdemo;

public class Example4 {
	void processData() {
		int sum=4;
		for(int index=1;index<=20;index=index+4) {
			sum=sum+index;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Example4 example4 = new Example4();
		example4.processData();
	}
} 
