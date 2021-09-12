package swati.Assignment32;

public class Assignment32 {
	
	void findTrippleMaxSum(int[] input) {
		int max=0;
		int maxTrippleIndex=0;
		int sum=0;
		for(int index=0;index<input.length-2;index++) {
			int num=input[index];
			if(num+1==input[index+1]) {
				if(num+2==input[index+2]) {
					sum=num+input[index+1]+input[index+2];
					
					if(max<sum) {
						max=sum;
						maxTrippleIndex=index;
					}
					
				}
			}
		}
	 System.out.println(input[maxTrippleIndex]+","+input[maxTrippleIndex+1]+","+input[maxTrippleIndex+2]+" is a triple having maximum sum");
	}

	public static void main(String[] a) {
		Assignment32 a1=new Assignment32();
		int[] input = {10,64,65,66,23,24,25,26,61,62};
		a1.findTrippleMaxSum(input);
	}
}