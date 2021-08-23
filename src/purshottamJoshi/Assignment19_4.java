package purshottamJoshi;

class Assignment19_4{
	public static void main(String[] args){
		int sum=0;
		String input = "10 10 20 30";		
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			sum += Integer.parseInt(output[index]);
		}
		
		System.out.println("Sum of numbers in a String : "+sum);

	}
	
	
}