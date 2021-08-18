package gauravk.Assignment_15;
/*
 * Assignment 15 : 16th Aug'2021


*program 1*:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";

output : 2



program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

Hint : charAt method of String class helps to retrieve character on given index


program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}

hint : 22 - 14 = 8

output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16
 */
public class MiddleCharacterOfStringsInArray {
	
	char[] extractMiddleCharacters(String[] arr) {
		char [] midCharArray = new char[arr.length];
		for(int i=0; i<arr.length; i++)
				midCharArray[i] = extractMidCharOfString(arr[i]);
		return midCharArray;
	}
	
	char extractMidCharOfString(String s1) {
		if(s1.length()%2==0)
			return s1.charAt(s1.length()/2);
		else return s1.charAt((s1.length()+1)/2);
	}
	
	public static void main(String[] a) {
		String[] str = {"hello","techno","credits"};
		MiddleCharacterOfStringsInArray middleCharacter1 = new MiddleCharacterOfStringsInArray();
		char[] middleChar = new char[str.length];
		middleChar = middleCharacter1.extractMiddleCharacters(str);
		for(int i=0; i<str.length; i++)
			System.out.println(middleChar[i]);
	}
}
