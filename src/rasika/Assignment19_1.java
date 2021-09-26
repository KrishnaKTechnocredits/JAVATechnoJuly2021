package rasika;

public class Assignment19_1 {

	 String getMaximumWordLength(String input) {
		 String[] output = input.split(" ");
		 String maxWord = "";
		 for(int index = 0; index < output.length; index++) {
			 if(output[index].length() > maxWord.length()) {
				 maxWord = output[index];
			 }
		 }
		 return maxWord;	 
	 }

	
	public static void main(String[] args) {
		Assignment19_1 assignment19_1 = new Assignment19_1();
		String array = "good morning technocredits hi";
		System.out.println("The max/big word from string is " +assignment19_1.getMaximumWordLength(array));
	}
}
