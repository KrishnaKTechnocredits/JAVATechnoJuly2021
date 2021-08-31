package husain.Assignment24;

import java.util.Scanner;

public class Program1 {
	
	int aCount, eCount, iCount, oCount, uCount;

	void findCountOfVowels(String str) {
		
		String vowel = "";
		for (int index = 0; index < str.length(); index++) {
			switch (str.charAt(index)) {

			case 'a':
			case 'A':
				if(aCount<1) {
					aCount++;
					vowel = vowel + str.charAt(index) + ",";
				}
				break;

			case 'e':
			case 'E':
				if(eCount<1) {
					eCount++;
					vowel = vowel + str.charAt(index) + ",";
				}
				break;

			case 'i':
			case 'I':
				if(iCount<1) {
					iCount++;
					vowel = vowel + str.charAt(index) + ",";
				}
				break;

			case 'o':
			case 'O':
				if(oCount<1) {
					oCount++;
					vowel = vowel + str.charAt(index) + ",";
				}
				break;

			case 'u':
			case 'U':
				if(uCount<1) {
					uCount++;
					vowel = vowel + str.charAt(index) + ",";
				}
				break;

			default:
				break;
			}

		}

		displayData(vowel);
		

	}

	void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String str = scanner.nextLine();
		findCountOfVowels(str);

	}

	void displayData(String str) {
		System.out.println("The list of vowels is " + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj = new Program1();
		obj.getInput();

	}

}
