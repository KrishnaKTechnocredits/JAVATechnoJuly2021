package sayli_Vyavhare;

public class Assignment_19_MaxWordinString {

	int getWordsInAString(String str){
		
		String[] array=str.split(" ");
		int temp=array.length;
	
	return temp;
	}	
	void getMaxWordLength(String input) {
		String[] array=input.split(" ");
		String maxWord="";
		for(int index=0;index<array.length;index++) {
			if(maxWord.length()<array[index].length()) 
				maxWord=array[index];
				}
		System.out.println("Word with maximum length is: "+maxWord);
	}
	void getMinWordLength(String input){
		String[] array=input.split(" ");
		String minWord=array[0];
		for(int index=0;index<array.length;index++) {
			if(minWord.length()>array[index].length()) 
				minWord=array[index];
				}
		System.out.println("Word with minimum length is: " +minWord);	
	}
	
	void getSumOfAllNumbers() {
		String input="10 10 20 30";
		int sumOfNumbers = 0;
		String[] array=input.split(" ");
		
		for(int index=0;index<array.length;index++) {
			sumOfNumbers = sumOfNumbers + Integer.parseInt( array[index]);
	     }
		System.out.println("Sum of all numbers: "+sumOfNumbers);	
	}
	
	public static void main(String[] args) {
		String str= "Hi Techno Credits Hello";
		String input="good morning technocredits hi hello";
		Assignment_19_MaxWordinString assignment19=new Assignment_19_MaxWordinString();
		System.out.println("Words in a given statement:" + assignment19.getWordsInAString(str));
		assignment19.getSumOfAllNumbers();
		assignment19.getMaxWordLength(input);
		assignment19.getMinWordLength(input);
	}	
}
