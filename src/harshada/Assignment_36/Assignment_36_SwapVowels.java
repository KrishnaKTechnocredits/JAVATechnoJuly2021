/* 
Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah" */

package harshada.Assignment_36;

public class Assignment_36_SwapVowels {
	
		void getVowelSwap(String str) {
			char vowel = ' ';
			int count = 0;
			int temp = 0;
			for (int index = 0; index < str.length(); index++) { //get vowels count
				char ch = str.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			int arr[] = new int[count]; // array to store only vowels
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					arr[temp] = index; //good morning a[0]=1
					temp++;//1
				}
			}
			char[] ch = str.toCharArray();
			for (int index = 0; index < arr.length / 2; index++) {
				vowel = ch[arr[index]];
				ch[arr[index]] = ch[arr[arr.length - 1 - index]];
				ch[arr[arr.length - 1 - index]] = vowel;
			}
			System.out.println("After Swapping Vowels String is = " + new String(ch)+"\n");
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Assignment_36_SwapVowels obj = new Assignment_36_SwapVowels();
			String str1 = "good morning";
			String str2 = "haorseuih";
			String str3 = "harshada";
			System.out.println("Original String =  "+ str1 );
			obj.getVowelSwap(str1);
			System.out.println("Original String =  "+ str2 );
			obj.getVowelSwap(str2);
			System.out.println("Original String =  "+ str3 );
			obj.getVowelSwap(str3);
			
		}

	}