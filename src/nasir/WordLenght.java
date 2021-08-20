package nasir;

public class WordLenght {
	public int lenghtOfWord(String str) {
		String[] input = new String[str.length()];
		input = str.split(" ");
		int output = input.length;
		return output;

	}

	public String maxWord(String str1) {
		int max = 0;
		String output = "";
		String[] input = new String[str1.length()];
		input = str1.split(" ");
		for (int index = 0; index <= input.length - 1; index++) {
			if (max < input[index].length()) {
				max = input[index].length();
				output = input[index];
			}
		}
		return output;
	}

	public String minWord(String str2) {
		String output = "";
		String[] input = new String[str2.length()];
		input = str2.split(" ");
		int min=input[0].length();
		for(int index=0;index<=input.length-1;index++){
			if(min>input[index].length()){
				min=input[index].length();
				output=input[index];
			}
		}
		return output;
	}
	int sumOfNumbers(String str3){
		int sum=0;
		String[] arr=new String[str3.length()];
		arr=str3.split(" ");
		int input[]=new int[arr.length];
		for(int index=0;index<=input.length-1;index++){
			input[index]=Integer.parseInt(arr[index]);
			sum=sum+input[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		WordLenght wordLenght = new WordLenght();
		System.out.println("Length of the given word is " + wordLenght.lenghtOfWord("Hi Techno Credits Hello"));
		System.out.println(wordLenght.maxWord("good morning technocredits hi hello"));
		System.out.println(wordLenght.minWord("good morning technocredits hi hello"));
		System.out.println(wordLenght.sumOfNumbers("10 10 20 30"));
	}

}
