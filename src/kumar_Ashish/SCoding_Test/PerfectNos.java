package kumar_Ashish.SCoding_Test;

public class PerfectNos {
	void getFirstFive(){
		long sum ;
		long num =4;
		long count = 0;
		while(count<=6) {
				sum = 0;
				num++;
				for(long index =1; index <num ; index ++){
					if(num % index ==0)
						sum = sum + index ; 
				}
				if(sum == num){
					System.out.println(num + " is a perfect number");
					count++;
					}
			}
	}	
	
	public static void main(String[] args){
		PerfectNos pn = new PerfectNos();
		pn.getFirstFive();
			
	}

}
