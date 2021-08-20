package shraddha;

public class StringToArrayExamples {

	public static void main(String[] args) {
		String inputString = "Hello Customer Can You Find Words In Given String";
		StringToArrayExamples stringToArrayExamples = new StringToArrayExamples();
		stringToArrayExamples.countOfWordsInGivenString(inputString);
		stringToArrayExamples.biggestWordInGivenString(inputString);
		stringToArrayExamples.smallestWordInGivenString(inputString);
		String numberString = "10 10 20 30 40 50";
		stringToArrayExamples.sumOfAllNumbersInString(numberString);
	}

	void countOfWordsInGivenString(String inputString) {
		System.out.println("Input String is :- " + inputString);
		String[] stringArray = inputString.split(" ");
		System.out.println(" Number of words in the given String is :- " + stringArray.length);
	}
	
	void biggestWordInGivenString(String inputString) {
		String[] stringArray = inputString.split(" ");
		String biggestWord = "";
		for(int index = 0; index < stringArray.length; index ++) {
			if(stringArray[index].length() > biggestWord.length())
				biggestWord = stringArray[index];
		}
		System.out.println(" The biggest word in the given String is :- " + biggestWord);
	}
	
	void smallestWordInGivenString(String inputString) {
		String[] stringArray = inputString.split(" ");
		String smallestWord = stringArray[0];
		for(int index = 0; index < stringArray.length; index ++) {
			if(stringArray[index].length() < smallestWord.length())
				smallestWord = stringArray[index];
		}
		System.out.println(" The smallest word in the given String is :- " + smallestWord);
	}
	
	void sumOfAllNumbersInString(String inputString) {
		System.out.println("---------------------------------------------");
		System.out.println("Input String of nubers is :- "+ inputString);
		String[] stringArray = inputString.split(" ");
		int sum = 0;
		for(int index = 0; index < stringArray.length; index ++) {
			int number = Integer.parseInt(stringArray[index]);
			sum += number;
		}
		System.out.println(" The sum of all Numbers in the given String is :- " + sum);
	
	}

}
