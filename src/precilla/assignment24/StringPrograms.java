package precilla.assignment24;

import java.util.Arrays;
import java.util.Scanner;

public class StringPrograms {
	
	void getVowels(String str) {
		String vowels="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				if(index==str.indexOf(ch)) {
					if(vowels!="") 
						vowels+=",";
					vowels+=ch+"";
				}
			}		
		}
		System.out.println(vowels);
	}
	void maxword(String[] arr) {
		int count=0,index=0;
		int maxCount=0;
		String word="";
		for(index=0;index<arr.length;index++) {
			for(int index1=0;index1<arr.length;index1++) {
				if(arr[index].equals(arr[index1])){
					count++;	
				}
			}
			if(maxCount<count) {
				maxCount=count;
				word=arr[index];
			}
			count=0;
		}
		System.out.println(word+ " -> "+maxCount);		
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPrograms stringPrograms=new StringPrograms();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Program 1: Count the Number of Vowels in user defined string");
		System.out.print("Input :");
		String string=scanner.next();
		System.out.print("output: vowels are ");
		stringPrograms.getVowels(string);
		System.out.println("\nProgram 2 : Max repeating word with its frequency");
		String value= "Hi Hello Hi Techno Hello Hi";
		System.out.println("Input :"+value);
		String[] array=value.split(" ");
		stringPrograms.maxword(array);
	}

}


