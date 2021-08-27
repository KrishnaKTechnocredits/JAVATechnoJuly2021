package elizabeth;


class CodingTest1{
	
	int getSumOfAllDigits(String input){
		int sum=0;
		boolean flag=false;
		for(int index=0;index<input.length();index++){
			flag=Character.isDigit(input.charAt(index));
			if(flag){
				int output=Character.getNumericValue(input.charAt(index));
				sum+=output;
			}
		}
		return sum;
	}

	
	int getSumOfDigitsInArray(String[] arr){
		int sum=0;
		for(int index=0;index<arr.length;index++){
			sum=sum+getSumOfAllDigits(arr[index]);
		}
	return sum;
	}
	
	
	public static void main(String[] args){
		CodingTest1 codingTest1=new CodingTest1();
		String input[]={"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		System.out.println("Sum of all digits in the array: ");
		System.out.println(codingTest1.getSumOfDigitsInArray(input));
	
	}
}