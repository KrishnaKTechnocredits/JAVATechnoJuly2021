package purshottamJoshi;

class Assignment24_1{
	int countTotalVowels=0;
	int countVowels(String str){
		String newStr = str.toLowerCase();
		String[] input=newStr.split("");
		for(int index=0; index < input.length; index++){
			if(input[index].equals("a") || input[index].equals("e") || input[index].equals("i") || input[index].equals("o") || input[index].equals("u") ){
				countTotalVowels++;
			}
		}
		return countTotalVowels;
	}
	
	public static void main(String[] args){
		Assignment24_1 assignment24_1 = new Assignment24_1();
		System.out.println("No of vowels in string : "+assignment24_1.countVowels("TECHNOCREDITS"));
		
	
	}
}