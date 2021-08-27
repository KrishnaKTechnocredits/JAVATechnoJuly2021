package rasika;

public class Assignment19_2 {

	 String getMinimumWordLength(String input) {
		 String[] output = input.split(" ");
		 String minWord = output[0];
		 for(int index = 0; index < output.length; index++) {
			 if(output[index].length() < minWord.length()) {
				 minWord = output[index];
			 }
		 }
		 return minWord;	 
	 }

	
	public static void main(String[] args) {
		Assignment19_2 assignment19_2 = new Assignment19_2();
		String array = "good morning technocredits hi";
		System.out.println("The min/small word from string is " +assignment19_2.getMinimumWordLength(array));
	}

}
