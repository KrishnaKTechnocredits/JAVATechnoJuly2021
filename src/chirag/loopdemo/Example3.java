package chirag.loopdemo;

public class Example3 {
	void processData() {
		int sum=0;
		for(int index=1;index<=10;index=index+3) {
		//sum+=index;	
		sum=sum+index;
		
		System.out.println(sum); 
	}
		}
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.processData();
	}

}
