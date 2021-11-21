package purshottamJoshi;

public class Purshottam_CodingTest9 {

	void getNumber(int[] input) {
		
		int number=input[0];
		
		for(int index=0; index < input.length; index++) {
			if(input[index] < 0 && number < (input[index])) {
				number=input[index];
				
				System.out.println("number close to 0 : "+number);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr =  {-3,11,123,-11,-9,-55,33,44,-1};
		new Purshottam_CodingTest9().getNumber(arr);
	}
}
