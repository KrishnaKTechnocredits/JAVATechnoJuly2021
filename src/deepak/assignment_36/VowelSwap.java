/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/

package deepak.assignment_36;

public class VowelSwap {
	
	String vowelSwap(String str){
		int count = 0;
		String Output = "";
		for(int index = 0; index<str.length(); index++){
			if(str.charAt(index)=='a' || str.charAt(index)=='e' || str.charAt(index)=='i' || 
					str.charAt(index)=='o' || str.charAt(index)=='u'){
				Output = Output+getRVowels(str).charAt(count);
				count++;
			}else
				Output = Output+str.charAt(index);
		}
		return Output;
	
	}
	
	String getRVowels(String str){
		String rVowels = "";
		for(int index = str.length()-1; index>=0; index--){
			if(str.charAt(index)=='a' || str.charAt(index)=='e' || str.charAt(index)=='i' || 
					str.charAt(index)=='o' || str.charAt(index)=='u'){
				rVowels = rVowels+str.charAt(index);
			}
		}
		return rVowels;
	}
	
	
	public static void main(String[] args) {
		VowelSwap obj = new VowelSwap();
		String str1 = "good morning";
		String str2 = "amol";
		String str3 = "haorseuih";
		System.out.println("Input: "+str1+"\nOutput: "+obj.vowelSwap(str1));
		
		System.out.println("\nInput: "+str2+"\nOutput: "+obj.vowelSwap(str2));
		
		System.out.println("\nInput: "+str3+"\nOutput: "+obj.vowelSwap(str3));

	}

}
