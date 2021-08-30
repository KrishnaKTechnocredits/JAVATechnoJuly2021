package arti_G_Assignment24;

import java.util.Scanner;

/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : "technocredits"
output : vowels are e , o, i 
"a e i o u"
Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
public class FrequencyCount {

	String findVowels(String str){
		String vowels = "";

		for(int i=0;i <str.length();i++){
			switch (str.charAt(i)){
				case 'a':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'e':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'i':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'o':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'u':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				}
		}

		return vowels;

	}
	
	void countString(String str1){
		String[] input = str1.split(" ");

		String maxStr = "";
		int maxcount = 0;
		for (int index=0; index < input.length; index++){
			int freqCount = 1;

			for (int innerindex = index+1; innerindex < input.length; innerindex++){
				if ( input[index].equals(input[innerindex]))
					freqCount++;

				if (freqCount > maxcount){
					maxcount = freqCount;
					maxStr = input[index];
				}

			}
		}
		System.out.println(maxStr + " ->" + maxcount);
	}
	
  	public static void main(String[] args) {
  		
  		FrequencyCount frequencyCount = new FrequencyCount();
  		Scanner scanner = new Scanner(System.in);
  		System.out.println("Enter the String :");
  		String str = scanner.nextLine();
  		System.out.println(frequencyCount.findVowels(str));
  		
  		String str1 = "Hi Hello Hi Techno Hello Hi";
  		frequencyCount.countString(str1);
  		
  	
		}
	}

