package rushikesh.codetests;

public class CodeTest1 {
	
	int getSum(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++)
			if(Character.isDigit(input.charAt(index)))
				sum+=Character.getNumericValue(input.charAt(index));
		return sum;
	         }
		
	int getSumInArray(String[] input) {
		int totalSum=0;
		for(int index=0;index<input.length;index++)
			totalSum+=getSum(input[index]);
		return totalSum;
	}
			
		
	public static void main(String[] args) {
		CodeTest1 codeTest1 =new CodeTest1();
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"}; 
		System.out.println("The sum of digits is "+codeTest1.getSumInArray(input));
		
	}

}
